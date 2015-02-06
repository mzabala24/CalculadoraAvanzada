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
public class Elemento {
    /**1. Almacena un numero, 2.Almacena un operador/
     * 
     */
    private int tipo;
    
    //el numero en la expresion agebraica
    private double numero;
    
    //El operador en la expresion algebraica
    private char operador;
    
    //verifica si la pieza o elemento del array ya fue evaluada
    private boolean evaluado;
    
    //Acumula el resultado parcial del resultado de la operacion
    private double acumula;

    public Elemento(double numero) {
        this.tipo=1;//el numero 1 indica que es un numero
        this.numero = numero;
        
        this.evaluado=false;
        this.acumula=numero;
    }

    public Elemento(char operador) {
        this.tipo=2;//el numero 2 indica un operador
        this.operador = operador;
        
        this.evaluado=false;
        this.acumula=0;
    }

    public double getAcumula() {
        return acumula;
    }

    public int getTipo() {
        return tipo;
    }

    public double getNumero() {
        return numero;
    }

    public char getOperador() {
        return operador;
    }

    public boolean isEvaluado() {
        return evaluado;
    }

    public void setEvaluado(boolean evaluado) {
        this.evaluado = evaluado;
    }

    public void setAcumula(double acumula) {
        this.acumula = acumula;
    }
}
