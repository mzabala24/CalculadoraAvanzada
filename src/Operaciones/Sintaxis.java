/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operaciones;

/**
 *
 * @author Administrator
 */
public class Sintaxis {
    
    //Retira los espacios de la expresión
    private String sinEspacios(String expresion){
        String nueva="";
        int largo, pos;
        char car1;
        largo = expresion.length();
        
        //Recorro la cadena de caracteres
        for(pos =0; pos <= largo-1;pos++){
            car1= expresion.charAt(pos);
            if(car1 != ' ')
            { nueva = nueva +car1;}
        }
        return nueva;
    }
    
    //1. Cadena vacia
    public boolean cadenaVacia(String expresion){
        if(expresion.length()==0){
            return true;
        }
        return false;
    }
    
    //2. Dos o mas operadores estan seguidos. Ejemplo 2++4,5-*3
    private boolean dosOperadoresSeguidos(String expresion){
    
        int largo;
        char char1, char2;
        
        largo= expresion.length();
        
        //recorremos todos los caracteres
        for (int i = 0; i <= largo - 2; i++) {
            
            char1 = expresion.charAt(i);
            char2= expresion.charAt(i+1);
            if(char1=='+' || char1=='-' || char1=='*' ||char1=='/' || char1=='^')
                if(char2=='+' || char2=='-' ||char2=='*' ||char2=='/' ||char2=='^') return true;           
        }
        return false;
    }
    
    //3.Un operador seguido de un parentesis que cierra. Ejemplo: 2-(4+)-7
    private boolean operadorParentesisCierra(String expresion){
       char char1,char2;
       
        for (int i = 0; i <= expresion.length()-2; i++) {
            char1=expresion.charAt(i);
            char2=expresion.charAt(i+1);
            //Compara si el primer caracter es operador u el siguiente es parantesis que cierra
            if(char1=='+' || char1=='-' ||char1=='*' ||char1=='/' ||char1=='^')
                if(char2==')') return true;
        }
        return false;
    }
    
    //4. Un parentesis que abre seguido de un operador. Ejemplo: 2-(*3)
    private boolean parentesisOperadorAbre(String expresion){
       char char1,char2;
       
        for (int i = 0; i <=expresion.length()-2; i++) {
            char1=expresion.charAt(i);
            char2=expresion.charAt(i+1);
            //Compara si el primer caracter es operador u el siguiente es parantesis que cierra
            if(char1=='(')
                if(char2=='+'  || char2=='-' ||char2=='*' ||char2=='/' ||char2=='^') return true;
        }
        return false;
    }
    
    //5. Que empieze con algun operador
      private boolean iniciaOperador(String expresion){
       char char1;
       
        for (int i = 0; i <= expresion.length()-2; i++) {
            char1=expresion.charAt(i);
            //Compara el operador
            
                if(char1=='+'  || char1=='-' ||char1=='*' ||char1=='/' ||char1=='^') return true;
        }
        return false;
    }
      //.Que termine con operador. Ejemplo: 12-67*,2/3-
      private boolean finalizaOperador(String expresion){
       char char1;
       
        
            char1=expresion.charAt(expresion.length()-1);
                if(char1=='+'  || char1=='-' ||char1=='*' ||char1=='/' ||char1=='^') return true;
        
        return false;
    }
      
      //7.Que los parentesis esten desbalanceados. Ejemplo: 3-(2*4))
       private boolean parenctesisDesbalanceados(String expresion){
       
           char char1;
           int parabre, parcierra;
           parabre=0;
           parcierra=0;
           
           for (int i = 0; i <=expresion.length()-1; i++) {
               char1=expresion.charAt(i);
               if(char1=='(') parabre++;
               if(char1==')') parcierra++;
           }
           
           if(parabre!=parcierra) return true;
        return false;
       }
//8.Que haya parentesis vacio.Ejemplo: 2-()*3
       private boolean parenctesisVacio(String expresion){
       
           char char1,char2;
         
           
           for (int i = 0; i <= expresion.length()-2; i++) {
               char1=expresion.charAt(i);
               char2=expresion.charAt(i+1);
               if(char1=='(' && char2==')') return true;
           }
        return false;
       }
       
       //9.Así esten balanceados los parentesis no corresponde el que abre con el que cierra. Ejemplo: 2+3)-2*(4
       private boolean parentesisBalanceoIncorrecto(String expresion){
           char char1;
           int balance;
           balance=0;
           
           
           for (int i = 0; i <=expresion.length()-1; i++) {
               char1=expresion.charAt(i);
               if(char1=='(') balance++;
               if(char1==')') balance--;
               if(balance<0) return true;
           }
        return false;
       }
       
       //10.Un parentesis que cierra seguido de un numero. Ejemplo: (12-4)7-1
       private boolean parentesisNumeroCierra(String expresion){
       char char1,char2;
       
        for (int i = 0; i <=expresion.length()-2; i++) {
            char1=expresion.charAt(i);
            char2=expresion.charAt(i+1);
            //Compara si el primer caracter es operador u el siguiente es parantesis que cierra
            if(char1==')')
                if((char2>='0'  && char2<='9') ||char2=='.') return true;
        }
        return false;
    }
     //  11.Un numero seguido de un parentesis que abre. Ejemplo: 7-2(5-6)
      private boolean parentesisNumeroAbre(String expresion){
       char char1,char2;
       
        for (int i = 0; i <=expresion.length()-2; i++) {
            char1=expresion.charAt(i);
            char2=expresion.charAt(i+1);
            //Compara si el primer caracter es operador u el siguiente es parantesis que cierra
            if((char1>='0'  && char1<='9') ||char1=='.')
                if(char2=='(') return true;
        }
        return false;
    } 
      
      //12.Doble punto en un numero de tipo real. Ejemplo: 3-2..4+1
      private boolean doblePuntoNumero(String expression){
          int totalPuntos;
          totalPuntos=0;
          char char1;
          for (int i = 0; i <= expression.length()-1; i++) {
              char1= expression.charAt(i);
              if((char1<'0' || char1>'9') && char1!='.') totalPuntos=0;
              if(char1=='.') totalPuntos++;
              if(totalPuntos>1) return true;
          }
          return false;
      }
      
      //13.Un parentesis que cierra seguido de una variable. Ejemplo: (12-4)y-1
      private boolean parentesisCierraVariable(String expression){
          char char1,char2;
          for (int i = 0; i <= expression.length()-1; i++) {
              char1= expression.charAt(i);
              char2= expression.charAt(i+1);
              if(char1==')')
              if(char2>='a' && char2<='z') return true;
          }
          return false;
      }
      //14.Una variable seguida de un punto: 4-z.1+3
       private boolean variableLuegoPunto (String expression){
          char char1,char2;
          for (int i = 0; i <= expression.length()-2; i++) {
              char1= expression.charAt(i);
              char2= expression.charAt(i+1);
              if(char1>='a' && char1<='z')
              if(char2=='.') return true;
          }
          return false;
      }
      //15.Un punto seguida de una variable. Ejemplo 7-2.p+1
       private boolean puntoLuegoVariable(String expression){
          char char1,char2;
          for (int i = 0; i <= expression.length()-2; i++) {
              char1= expression.charAt(i);
              char2= expression.charAt(i+1);
              if(char1=='.')
              if(char2>='a' && char2<='z') return true;
          }
          return false;
      }
       //16.Un numero antes de una variable
        private boolean numeroAntesVariable(String expression){
          char char1,char2;
          for (int i = 0; i <= expression.length()-2; i++) {
              char1= expression.charAt(i);
              char2= expression.charAt(i+1);
              if(char1>='0' && char2 <='9')
              if(char2>='a' && char2<='z') return true;
          }
          return false;
      }
    //17.Un numero despues de una variable. Ejemplo: x21+4
         private boolean variableDespuesNumero(String expression){
          char char1,char2;
          for (int i = 0; i <= expression.length()-2; i++) {
              char1= expression.charAt(i);
              char2= expression.charAt(i+1);
              if(char1>='a' && char2<='z')
              if(char2>='0' && char2<='9') return true;
          }
          return false;
      }
         
    //18.Haya caracteres invalidos
         private boolean caracterInvalido(String expresion){
             String caractervalido="abcdefghijklmnopqrstuvwxyz0123456789.+-*/^()";
             char char1,char2;
             boolean caracterInvalido;
             for (int i = 0; i <= expresion.length()-1; i++) {
                 char1 = expresion.charAt(i);
                 caracterInvalido=true;
                 for (int j = 0; j < caractervalido.length()-1; j++) {
                     char2= caractervalido.charAt(j);
                     if(char1==char2) caracterInvalido=true;
                 }
                 if(caracterInvalido)return true;
             }
             return false;
         }
         //19.Verifica si hay 4 o mas variables seguidas
         
         private boolean verificaCuatroLetras(String expresion){
             char char1,char2,char3,char4;
             for (int i = 0; i <= expresion.length()-4; i++) {
                 char1=expresion.charAt(i);
                 char2=expresion.charAt(i+1);
                 char3=expresion.charAt(i+2);
                 char4=expresion.charAt(i+3);
                 
                 if(char1>='a' && char1<='z' && char2>='a' && char2<='z' && char3>='a' && char3<='z' && char4>='a' && char4<='z') return true;
             }
             return false;
         }
         
         //20.Si detecta tres letras seguidas y luego un paréntesis que abre, entonces verifica si es función o no
         
         private boolean funcionInvalida(String expresion){
             
             boolean chequeaFuncion;
             char char1,char2,char3,char4;
             for (int i = 0; i <=expresion.length()-3; i++) {
                 char1=expresion.charAt(i);
                 char2=expresion.charAt(i+1);
                 char3=expresion.charAt(i+2);
                 
                 //Verifica si encuentra tres letras seguidas
                 if(char1>='a' && char1<='z' && char2>='a' && char2<='z' && char3>='a' && char3<='z'){
                 
                  if(i<expresion.length()-4){
                      char4=expresion.charAt(i+3);
                      //verifica si el siguiente caracter es (
                      if(char4=='('){
                          chequeaFuncion= esUnaFuncion(char1, char2, char3);
                          if(chequeaFuncion==false) return true;
                      }else return true;//Error no encontro parentesis
                  }else return true;//Error, no siguie parentesis
                 }
                     
             }
             return false;
         }
         
         private boolean esUnaFuncion(char char1,char char2, char char3){
             String listaFunciones;
             char listfunc1,listfunc2,listfunc3;
            listaFunciones="sinsencostanabslogexpsqrrcb";
            
             for (int i = 0; i <= listaFunciones.length()-3; i++) {
                 listfunc1=listaFunciones.charAt(i);
                 listfunc2=listaFunciones.charAt(i+1);
                 listfunc3=listaFunciones.charAt(i+2);
                 if(char1==listfunc1 && char2==listfunc2 && char3==listfunc3) return true;
             }
             return false;
         }
         
         //21.Si detecta solo dos letras seguidas es un error. Ejemplo 4+tk+8.9
         
         private boolean variableInvalida(String expression){
             int cuentaletras=0;
             char char1;
             
             for (int i = 0; i <= expression.length()-1; i++) {
                 char1= expression.charAt(i);
                 if(char1>='a' && char1<='z')
                     cuentaletras++;
                 else{
                     if(cuentaletras==2) return true;
                     cuentaletras=0;
                 }
             }
             if(cuentaletras==2) return true;
             return false;
         }
         
         //22.Antes de parentesis hay una letra
         private boolean variableParentesisAbre(String expression){
             int cuentaletras=0;
             char char1;
             
             for (int i = 0; i <= expression.length()-1; i++) {
                 char1= expression.charAt(i);
                 if(char1>='a' && char1<='z')
                     cuentaletras++;
                 else if(char1=='('){
                     if(cuentaletras==1) return true;
                     cuentaletras=0;
                 }
             }
             return false;
         }
         
         public int evaluaSintaxis(String expresion){
             String sinEspacio;
             
             sinEspacio=sinEspacios(expresion);
             
             //Pruebas de sintaxis
             if(cadenaVacia(sinEspacio)) return 1;
             if(dosOperadoresSeguidos(sinEspacio)) return 2;
             if(operadorParentesisCierra(sinEspacio)) return 3;
             if (parentesisOperadorAbre(sinEspacio)) return 4;
             if(iniciaOperador(sinEspacio)) return 5;
             if(finalizaOperador(sinEspacio)) return 6;
             if(parenctesisDesbalanceados(sinEspacio)) return 7;
             if(parenctesisVacio(sinEspacio)) return 8;
             if(parentesisBalanceoIncorrecto(sinEspacio)) return 9;
             if(parentesisNumeroCierra(sinEspacio)) return 10;
             if(parentesisNumeroAbre(sinEspacio)) return 11;
             if(doblePuntoNumero(sinEspacio)) return 12;
             if(parentesisCierraVariable(sinEspacio)) return 13;
             if(variableLuegoPunto(sinEspacio)) return 14;
             if(puntoLuegoVariable(sinEspacio)) return 15;
             if(numeroAntesVariable(sinEspacio)) return 16;
             if(variableDespuesNumero(sinEspacio)) return 17;
             if(caracterInvalido(sinEspacio)) return 18;
             if(verificaCuatroLetras(sinEspacio)) return 19;
             if(funcionInvalida(sinEspacio)) return 20;
             if(variableInvalida(sinEspacio)) return 21;
             if(variableParentesisAbre(sinEspacio)) return 22;
             
             return 0;
             
         }
         
         public String mensajeSintaxis(int codigoError){
             
             String mensaje;
             mensaje="...";
             
             switch(codigoError){
                 case 0:
                     mensaje="No se detecto error sintactico en las pruebas realizadas"; break;
                 case 1:
                     mensaje="1.Cadena Vacia"; break;
                 case 2:
                     mensaje="2.Dos o mas operadores estan seguidos. Ejemplo: 2++4, 5-*3"; break;
                 case 3:
                     mensaje="3.Un operador seguido de un paréntesis que cierra. Ejemplo: 2-(4+)-7"; break;
                 case 4:
                     mensaje="4.Un paréntesis que abre seguido de un operador. Ejemplo: 2-(*3)"; break;
                 case 5:
                     mensaje="5.Que empiece con operador +, *, /. Ejemplo: /12-5*2 , *17-4\""; break;
                 case 6:
                     mensaje="6.Que termine con operador. Ejemplo: 12-67* 2/3"; break;
                 case 7:
                     mensaje="7.Que los paréntesis estén desbalanceados. Ejemplo: 3-(2*4))"; break;
                 case 8:
                     mensaje="8.Que haya paréntesis vacío. Ejemplo: 2-()*3"; break;
                 case 9:
                     mensaje="9.Así estén balanceados los paréntesis no corresponde el que abre con el que cierra. Ejemplo: 2+3)-2*(4"; break;
                 case 10:
                     mensaje="10.Un paréntesis que cierra seguido de un número. Ejemplo: (12-4)7-1"; break;
                 case 11:
                     mensaje="11.Un número seguido de un paréntesis que abre. Ejemplo: 7-2(5-6)"; break;
                 case 12:
                     mensaje="12.Doble punto en un número de tipo real. Ejemplo: 3-2..4+1 7-6.46.1+2"; break;
                 case 13:
                     mensaje="13.Un paréntesis que cierra seguido de una variable. Ejemplo: (12-4)y-1"; break;
                 case 14:
                     mensaje="14.Una variable seguida de un punto. Ejemplo: 4-z.1+3"; break;
                 case 15:
                     mensaje="15.Un punto seguido de una variable. Ejemplo: 7-2.p+1"; break;
                 case 16:
                     mensaje="16.Un número antes de una variable. Ejemplo: 3x+1"; break;
                 case 17:
                     mensaje="17.Un número después de una variable. Ejemplo: x21+4"; break;
                 case 18:
                     mensaje="18.Haya caracteres inválidos. Ejemplo: 4+@-1"; break;
                 case 19:
                     mensaje="19.Hay 4 o más variables seguidas"; break;
                 case 20:
                     mensaje="20.Función inexistente"; break;
                 case 21:
                     mensaje="21.Variable invalida (solo pueden tener una letra)"; break;
                 case 22:
                     mensaje="22.Variable seguida de paréntesis que abre. Ejemplo: 5-a(7+3)"; break;
             }
             return mensaje;
         }
}
