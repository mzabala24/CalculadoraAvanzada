/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operaciones;

import com.sun.jmx.snmp.BerDecoder;
import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class Controlador {

    public Controlador() {
    }
    
    private static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
    public void prioridad(){
        
        String ejemplo="2+2*(2*2*(8+9)/6)+9*8";
        
        char operaciones[] = new char[7];
        operaciones[0]='(';
        operaciones[1]=')';
        operaciones[2]='^';
        operaciones[3]='*';
        operaciones[4]='/';
        operaciones[5]='+';
        operaciones[6]='-';
        
        ArrayList<Integer> posicionMayor= new ArrayList<Integer>();
        ArrayList<Integer> posicionMenor= new ArrayList<Integer>();
        ArrayList<Integer> encuentraNumero= new ArrayList<Integer>();
        CalculosBasicos cb= new CalculosBasicos();
        int posicionIni=0;
        int posicionFin=0;
        
        for(int i=ejemplo.length()-1;i>-1;i--){
            if(ejemplo.charAt(i)==operaciones[0]){
                posicionMayor.add(i);
            }  
        }
        for (int i = 0; i < posicionMayor.size()-1; i++) {
            if(posicionMayor.get(i)>posicionMayor.get(i+1)){
                posicionIni=posicionMayor.get(i);
            }
        }
        
        for (int i = posicionIni; i < ejemplo.length(); i++) {
            if(ejemplo.charAt(i)==operaciones[1]){
                posicionMenor.add(i); 
            } 
        }
        
        for (int i = 0; i < posicionMenor.size()-1; i++) {
            if(posicionMenor.get(i)<posicionMenor.get(i+1)){
                posicionFin=posicionMenor.get(i);
            }
        }
        String nuevoValor;
        
        nuevoValor=ejemplo.substring(posicionIni, posicionFin+1);
        
        for (int i = 0; i < nuevoValor.length(); i++) {
          if(isNumeric(Character.toString(nuevoValor.charAt(i)))){
              
              encuentraNumero.add(Integer.parseInt(""+nuevoValor.charAt(i)));
          }
           
        }
        int suma=0;
        int numero=0;
         for (int j = 0; j < nuevoValor.length(); j++) {
                if(nuevoValor.charAt(j)==operaciones[5]){
                    for (int i = 0; i < encuentraNumero.size(); i++) {
                        //System.out.println(encuentraNumero.get(0));
                        suma=suma+encuentraNumero.get(i);
                    }
                }
            }
        
         System.out.println(suma);
    }
}
