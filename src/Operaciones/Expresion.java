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
    
    /**
     * Esta constante sirve para que se reste el caracter y se obtenga el numero
     * Ejemplo: '7' - ASCIINUMERO=7
     */
    private static final int ASCIINUMERO=48;
    
    /**
     * Lista enlazada que tiene los componentes (numero perador) = COnstructor de elemento
     * de la expresion algebraica ya dividida
     */
    private ArrayList<Elemento> elementos = new ArrayList<Elemento>();
    
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
        
        /*Tamaño de la expresion simple*/
        int longitud = expresion.length();
        
        /*Extraer letra a letra*/
        char letra;
        
        /*conversion de String a double*/
        int entero=0,fraccion=0,divide=1;
        boolean puntoEntero=false;
        
        /*Si llevaba acumulado un valor numero esta variable se vuelve true*/
        boolean acumulaNumero=false;
        
        for (int i = 0; i < longitud; i++) {
            /*trae la letra*/
            letra=expresion.charAt(i);
            /*Si es un numero*/
            if((letra>='0' && letra<='9') || letra=='.')
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
                if(acumulaNumero)
                    elementos.add(new Elemento(+(double) fraccion/divide));
                /*Agrega a la lista*/
                elementos.add(new Elemento(letra));
                
                /*inicialia de nuevo las variables de conversión de string a numero*/
                entero=fraccion=0;
                divide=1;
                puntoEntero=acumulaNumero=false;
            }
        }
        
        /*Cierra la expresion simple preguntando si el ultimo operando es un numero*/
        
        Elemento elemtno = new Elemento(+(double) fraccion/divide);
        elementos.add(elemtno);
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
        
        for (int i = 0; i <totalElementos; i++) {
            /*Activa todas las piezas para que puedan ser evaluadas*/
            elementos.get(antes).setEvaluado(false);
            if(elementos.get(i).getTipo()==ESNUMERO)
                elementos.get(i).setAcumula(elementos.get(i).getNumero());
        }
        
        /*Recorre toda la lista*/
        for (int i = 0; i < totalElementos; i++) {
            /*Si encuentra un nodo del tipo operador y es exponente*/
            if(elementos.get(i).getTipo()==ESOPERADOR && elementos.get(i).getOperador()=='^')
            {
                for (antes=i-1;elementos.get(antes).isEvaluado(); antes--);
                
                for (sigue=i+1;elementos.get(sigue).isEvaluado(); sigue++);
                
               elementos.get(i).setEvaluado(true);
               elementos.get(sigue).setEvaluado(true);
               
               elementos.get(antes).setAcumula(Math.pow(elementos.get(antes).getAcumula(), elementos.get(sigue).getAcumula()));
            }
        }
        
        for (int i = 0; i < totalElementos; i++) {
            
            if(elementos.get(i).getTipo()==ESOPERADOR && (elementos.get(i).getOperador()=='*' || elementos.get(i).getOperador()=='/'))
            {
                for (antes=i-1;elementos.get(antes).isEvaluado(); antes--);
                
                for (sigue=i+1;elementos.get(sigue).isEvaluado(); sigue++);
                
               elementos.get(i).setEvaluado(true);
               elementos.get(sigue).setEvaluado(true);
               
               if(elementos.get(i).getOperador()=='*')
                   elementos.get(antes).setAcumula(elementos.get(antes).getAcumula()*elementos.get(sigue).getAcumula());
               else
               {
                   /*Validamos la division sobre 0*/
                   if(elementos.get(sigue).getAcumula() !=0)
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
            if(elementos.get(i).getTipo()==ESOPERADOR && (elementos.get(i).getOperador()=='+' || elementos.get(i).getOperador()=='-'))
            {
                for (antes=i-1;elementos.get(antes).isEvaluado(); antes--);
                
                for (sigue=i+1;elementos.get(sigue).isEvaluado(); sigue++);
                
               elementos.get(i).setEvaluado(true);
               elementos.get(sigue).setEvaluado(true);
               
               if(elementos.get(i).getOperador()=='+')
                   elementos.get(antes).setAcumula(elementos.get(antes).getAcumula()+elementos.get(sigue).getAcumula());
               else
               {
                  elementos.get(antes).setAcumula(elementos.get(antes).getAcumula()-elementos.get(sigue).getAcumula()); 
               }
            }
        }
        
        /*Resultado de la expresion*/
        
        return elementos.get(0).getAcumula();
    }
    
    public boolean getErrorMatematico()
    {
        return ERRORMATEMATICO;
    }
}
