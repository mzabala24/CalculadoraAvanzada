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
public class Pila {
    
    private int pila[];
    private int dato;
    private int cumbre=-1;
    private int max=0;
    private boolean resultado;

    public Pila(int max) {
        this.max = max;
        pila= new int[max];//Se crea la pila con el tamaño del constructor
        dato=0;
    }
    
    //Eliminamos todo el arreglo
    public void borrarPila(){
        cumbre=-1;
    }
    
    public boolean pilaLLena(){
        if(cumbre==(max-1)){ //Si el tamaño de mi arreglo es igual a max-1, el arreglo inicia desde 
            resultado=true;
        }else{
            resultado=false;
        }
        return resultado;
    }
    
    public boolean pilaVacia(){
        if (cumbre==-1) {
            resultado=true;
        }
        resultado=false;
        return resultado;
    }
    
    public boolean agregarDatoPila(int dato){
        if(pilaLLena()){
            System.out.println("Pila Llena");
        }else{
            cumbre++;
            pila[cumbre]=dato;
            resultado=true;
        }
        return resultado;
    }
    
    public int quitar(){
        if(pilaVacia()){
            System.out.println("No se puede quitar, esta vacia");
        }else{
            dato=pila[cumbre];
            cumbre--;
        }
        return dato;
    }
    
    public void mostrar(){
        for (int i = cumbre; i >= 0; i--) {
            System.out.println(pila[i]);
        }
    }
    
}
