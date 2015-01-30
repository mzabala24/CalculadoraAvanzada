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
public class CalculosBasicos {

    public CalculosBasicos() {
    }
    
   public int suma(int a, int b){
       return a+b;
   } 
   
   public int resta(int a, int b){
       return a-b;
   }
   
   public int multiplicacion(int a, int b){
       return a*b;
   }
   public int division(int a, int b){
       if(b==0){
           return 0;
       }else{
           return a/b;
       }
   }
   public int potenciacion(int a, int b){
       int i=1;
       int acumula=1;
       while(i==b){
          acumula=acumula*a; 
       i++;
       }
       return acumula;
   }
   
    
}
