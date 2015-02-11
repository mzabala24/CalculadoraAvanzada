/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operaciones;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Expresion {
   
    /**
     * Constantes para determinar que tipo es cada elemento en que se divide la expresion algebraica
     */
    
    private static final int ESNUMERO=1;
    private static final int ESOPERADOR=2;
    private static final int ESVARIABLE=3;
    private static final int ESFUNCION=4;
    
    /**
     * Esta constante sirve para que se reste el caracter y se obtenga el numero
     * Ejemplo: '7' - ASCIINUMERO=7
     */
    private static final int ASCIINUMERO=48;
    /**
     * Esta constante sirve para que se reste el caracter y se obtenga el numero usado en el arreglo
     * unidimensional que alberga los valores de las variables
     * Ejemplo: 'b'-ASCIILETRA=1
     */
    private static final int ASCIILETRA=97;
    private static final int TOMANOFUNCION=39;
    /**
     * Las funciones que soporta este evaluador
     */
    
    private static final String listaFunciones="sinsencostanabsasnacsatnlogceiexpsqrrcb";
    /**
     * Lista enlazada que tiene los componentes (numero perador) = COnstructor de elemento
     * de la expresion algebraica ya dividida
     */
    private ArrayList<Elemento> elementos = new ArrayList<Elemento>();
    private ArrayList<String> procedimiento = new ArrayList<String>();
    /**
     * Arreglo unidemensional con las 26 variables diferentes
     */
    private double valorVariable[]= new double[26];
    
    /**
     * lmacena hasta que nivel se llega en parentesis internos
     */
    
    private int MaximoNivel;
    
    /**
     * Esta variable me identifica los errores matematicos
     */
    private boolean ERRORMATEMATICO;
    
    /**
     * Este metodo se encarga de analizar la expresion y convertirla en una estructura
     * que permite evaluar la expresion.
     * 
     * Convierte una expresion algebraica en una sucesion de nodos.
     * |2| |+| |8.3| |/| |5| |*| |7.4|
     * 
     * @param expresion La expresion algebraica sin espacios y en minusculas
     */
    
    public void analizar(String expresion){
        /*Inicializa la lista de piezas*/
        elementos.clear();
        
        /*inicializa el nivel*/
        int nivel=0;
        MaximoNivel=0;
        /*Tamaño de la expresion simple*/
        int longitud = expresion.length();
        
        /*Extraer letra a letra*/
        char letra;
        
        /*conversion de String a double*/
        int entero=0,fraccion=0,divide=1;
        boolean puntoEntero=false;
        
        /*Si llevaba acumulado un valor numero esta variable se vuelve true*/
        boolean acumulaNumero=false;
        
        
        for (int i = 0; i < longitud; i++) 
        {
            /*trae la letra*/
            letra=expresion.charAt(i);
            
            /*Si hay un parentesis que abre, el nivel aumenta*/
            if(letra=='(')
            {
                nivel++;
                if(nivel>MaximoNivel) MaximoNivel=nivel;
            }
            /*Si es parentesis que cierra, el nivel disminuye*/
            else if(letra==')')
                nivel--;
            /*Si es una variable*/
            else if(letra>='a' && letra<='z')
            {
                if(i<longitud-1)
                {
                    /*Verifica si el siguiente caracter es una letra, dado el caso es una funcion*/
                  char letra2=expresion.charAt(i+1);
                  if(letra2>='a' && letra2<='z')
                  {
                      char letra3 = expresion.charAt(i+2);
                      /*Identificando las funciones*/
                       int funcionDetectada =1;
                  
                    for (int j = 0; j <= TOMANOFUNCION ;j+=3)
                    {
                        if(letra==listaFunciones.charAt(j)
                                && letra2==listaFunciones.charAt(j+1)
                                && letra3==listaFunciones.charAt(j+2))
                            break;
                        funcionDetectada++;
                    }
                    Elemento elemento = new Elemento(funcionDetectada, nivel, 'f');
                    elementos.add(elemento);
                    nivel++;
                    if(nivel>MaximoNivel) MaximoNivel=nivel;
                    
                    /*Mueve tres caracteres sin([s][i][n][(]*/
                    i+=3;
                  }
                else
                {
                    Elemento elemento = new Elemento(letra-ASCIILETRA, nivel);
                    elementos.add(elemento);
                } 
                }
                 else
                {
                    Elemento elemento = new Elemento(letra-ASCIILETRA, nivel);
                    elementos.add(elemento);
                } 
            }
            /*Si es un numero*/
            else if((letra>='0' && letra<='9') || letra=='.')
            {
                /*Ir armando el numero de tipo double*/
                if(letra=='.')
                    puntoEntero=true;
                else
                    if(!puntoEntero)
                        entero= entero*10+letra-ASCIINUMERO;//suma y multiplicacion sucesiva
                    else
                    {
                        fraccion = fraccion*10+letra-ASCIINUMERO;
                        divide= divide*10;
                    }
                acumulaNumero=true;
            }
            else
            {/* Si es un operador entonces crea el nodo del 
                operador y el nodo del numero si venia acyumulando un numero*/
                if(acumulaNumero){
                
                    Elemento elemento = new Elemento(entero+(double) fraccion/divide,nivel);
                    elementos.add(elemento);
                }
                    
                /*El nodo operador*/
                Elemento elemento = new Elemento(letra, nivel);
                /*Agrega a la lista*/
                elementos.add(elemento);
                
                /*inicialia de nuevo las variables de conversión de string a numero*/
                entero=fraccion=0;
                divide=1;
                puntoEntero=acumulaNumero=false;
            }
        }
        
        /*Cierra la expresion simple preguntando si el ultimo operando es un numero*/
        if(acumulaNumero){
         Elemento elemetno = new Elemento(entero +(double) fraccion/divide,nivel);
                elementos.add(elemetno);
        }
       
    }
    /** * Ya construida la lista del tipo: 
     * [nodo número] [nodo operador] [nodo número] [nodo operador] ..... * 
     * es ir del operador con mas precedencia al de menos precedencia. * * 
     * Este método se llama después de haber sido analizada la expresión. * * 
     * @return El valor de la expresión evaluada (double) */
    public double evaluar(){
        
        int  antes=0, sigue=0;
        ERRORMATEMATICO=false;
        
        /*Total de nodos en la lista creada*/
        int totalElementos = elementos.size();
        
        for (int i = 0; i < totalElementos; i++) {
            /*Activa todas las piezas para que sean evaluadas*/
            elementos.get(i).setEvaluado(false);
            
            /*Recorre toda la lista poniendo los valores de las variables  en el aumulado de cada pieza.
            Extrae el valor del arreglo unidimensional que alberga los valores de las variables*/
            
            if (elementos.get(i).getTipo()==ESVARIABLE) {
                elementos.get(i).setAcumula(valorVariable[elementos.get(i).getVariable()]);
            }else if(elementos.get(i).getTipo()==ESNUMERO)
                elementos.get(i).setAcumula(elementos.get(i).getNumero());
            
            //System.out.println(elementos.get(i).getAcumula());
        }
        
        /*Va del nivel mas profundo al mas superficial*/
    for (int evaluaNivel = MaximoNivel; evaluaNivel >= 0; evaluaNivel--) {
            
        //System.out.println(elementos.get(evaluaNivel).getAcumula());
        /*Recorre toda la lista*/
        for (int i = 0; i < totalElementos; i++) {
            
            /*Si encuentra un elemento de tipo funcion la evalua con el nivel de el siguiente elemento*/
            
            if(elementos.get(i).getNivel()==evaluaNivel && elementos.get(i).getTipo()==ESFUNCION)
            {
                
                switch(elementos.get(i).getFuncion())
                {
                    case 1:
                    case 2:
                        elementos.get(i).setAcumula(Math.sin(elementos.get(i+1).getAcumula()));
                        break;
                    case 3: 
                        elementos.get(i).setAcumula(Math.cos(elementos.get(i+1).getAcumula()));
                        break;
                    case 4:
                        elementos.get(i).setAcumula(Math.tan(elementos.get(i+1).getAcumula()));
                        break;
                    case 5:
                        if(elementos.get(i+1).getAcumula()>0)
                            elementos.get(i).setAcumula(elementos.get(i+1).getAcumula());
                        else
                            elementos.get(i).setAcumula(-elementos.get(i+1).getAcumula());
                        break;
                    case 6:
                        if(elementos.get(i+1).getAcumula()>=-1 && elementos.get(i+1).getAcumula()<=1)
                            elementos.get(i).setAcumula(Math.asin(elementos.get(i+1).getAcumula()));
                        else
                        {
                            ERRORMATEMATICO= true;
                            return 0;
                        }
                    break;
                    case 7: 
                        if(elementos.get(i+1).getAcumula()>=-1 && elementos.get(i+1).getAcumula()<=1)
                            elementos.get(i).setAcumula(Math.acos(elementos.get(i+1).getAcumula()));
                        else
                        {
                            ERRORMATEMATICO= true;
                            return 0;
                        }
                    case 8: 
                        elementos.get(i).setAcumula(Math.atan(elementos.get(i+1).getAcumula()));
                        break;
                    case 9:
                        elementos.get(i).setAcumula(Math.log(elementos.get(i+1).getAcumula()));
                        break;
                    case 10:
                        elementos.get(i).setAcumula(Math.ceil(elementos.get(i+1).getAcumula()));
                        break;
                    case 11:
                        elementos.get(i).setAcumula(Math.exp(elementos.get(i+1).getAcumula()));
                        break;
                    case 12:
                        if(elementos.get(i+1).getAcumula()>=0)
                            elementos.get(i).setAcumula(Math.sqrt(elementos.get(i+1).getAcumula()));
                        else
                        {
                            ERRORMATEMATICO=true;
                            return 0;
                        }
                    break;
                    case 13: 
                        elementos.get(i).setAcumula(Math.pow(elementos.get(i+1).getAcumula(),(double)1/3));
                        break;
                }
                elementos.get(i+1).setEvaluado(true);
            }
        }
        
        for (int i = 0; i < totalElementos; i++) {
            
       
            /*Si encuentra un nodo del tipo operador y es exponente*/
            if(elementos.get(i).getNivel()==evaluaNivel && elementos.get(i).getTipo()==ESOPERADOR && elementos.get(i).getOperador()=='^')
            {
                
                
                for (antes=i-1;elementos.get(antes).isEvaluado(); antes--);
                
                for (sigue=i+1;elementos.get(sigue).isEvaluado(); sigue++);
                
               elementos.get(i).setEvaluado(true);
               elementos.get(sigue).setEvaluado(true);
               
               procedimiento.add(""+elementos.get(antes).getAcumula());
               procedimiento.add(""+elementos.get(i).getOperador());
               procedimiento.add(""+elementos.get(sigue).getAcumula());
               /*System.out.println(elementos.get(antes).getAcumula());
               System.out.println(elementos.get(i).getOperador());
                System.out.println(elementos.get(sigue).getAcumula());*/
               elementos.get(antes).setAcumula(Math.pow(elementos.get(antes).getAcumula(), elementos.get(sigue).getAcumula()));
               
              
               
            }
        }
        
        for (int i = 0; i < totalElementos; i++) {
            // System.out.println(elementos.get(i).getAcumula());
            if(elementos.get(i).getNivel()==evaluaNivel && elementos.get(i).getTipo()==ESOPERADOR && (elementos.get(i).getOperador()=='*' || elementos.get(i).getOperador()=='/'))
            {
              
                for (antes=i-1;elementos.get(antes).isEvaluado(); antes--);
                
                for (sigue=i+1;elementos.get(sigue).isEvaluado(); sigue++);
                
               elementos.get(i).setEvaluado(true);
               elementos.get(sigue).setEvaluado(true);
               procedimiento.add(""+elementos.get(antes).getAcumula());
               procedimiento.add(""+elementos.get(i).getOperador());
               procedimiento.add(""+elementos.get(sigue).getAcumula());
               /*System.out.println(elementos.get(antes).getAcumula());
               System.out.println(elementos.get(i).getOperador());
                System.out.println(elementos.get(sigue).getAcumula());*/
               if(elementos.get(i).getOperador()=='*')
                   elementos.get(antes).setAcumula(elementos.get(antes).getAcumula()*elementos.get(sigue).getAcumula());
               else
               {
                   /*Validamos la division sobre 0*/
                   if(elementos.get(sigue).getAcumula()!=0)
                       elementos.get(antes).setAcumula(elementos.get(antes).getAcumula()/elementos.get(sigue).getAcumula());
                   else
                   {
                       ERRORMATEMATICO=true;
                       return 0;
                   }
               }
            }
        }
        
        /*Recorremos toda la lista*/
        for (int i = 0; i < totalElementos; i++) {
            
            /*si encuentra un nodo del tipo operador y es suma o resta*/
            if(elementos.get(i).getNivel()==evaluaNivel && elementos.get(i).getTipo()==ESOPERADOR && (elementos.get(i).getOperador()=='+' || elementos.get(i).getOperador()=='-'))
            {
                
                for (antes=i-1;elementos.get(antes).isEvaluado(); antes--);
                
                for (sigue=i+1;elementos.get(sigue).isEvaluado(); sigue++);
                
               elementos.get(i).setEvaluado(true);
               elementos.get(sigue).setEvaluado(true);
               procedimiento.add(""+elementos.get(antes).getAcumula());
               procedimiento.add(""+elementos.get(i).getOperador());
               procedimiento.add(""+elementos.get(sigue).getAcumula());
              /* System.out.println(elementos.get(antes).getAcumula());
               System.out.println(elementos.get(i).getOperador());
                System.out.println(elementos.get(sigue).getAcumula());*/
               if(elementos.get(i).getOperador()=='+')
                   elementos.get(antes).setAcumula(elementos.get(antes).getAcumula()+elementos.get(sigue).getAcumula());
               else
                  elementos.get(antes).setAcumula(elementos.get(antes).getAcumula()-elementos.get(sigue).getAcumula()); 
               
                }
           // System.out.println(elementos.get(antes).getAcumula());
            }
        }    
        /*Resultado de la expresion*/
        
        return elementos.get(0).getAcumula();
    }
    
    public void darValorVariable(char variable, double valor)
    {
        valorVariable[variable-ASCIILETRA]= valor;
    }
    
    public String retornaPasos(){
        String pasos="";
        for (int i = 0; i < procedimiento.size(); i++) {
            pasos=pasos+procedimiento.get(i)+"\n";
        }
        return pasos;
    }
    
    public boolean getErrorMatematico()
    {
        return ERRORMATEMATICO;
    }
}
