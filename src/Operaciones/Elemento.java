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
    
    /**
     * Nivel en la expresión, a mayor valor, es mayor profundidad en la expresion 
     */
    
    private int nivel;
    //el numero en la expresion agebraica
    private double numero;
    
    //El operador en la expresion algebraica
    private char operador;
    
    //La variable 
    private int variable;
    
    /*La funcion*/
    private int funcion;
    
    //verifica si la pieza o elemento del array ya fue evaluada
    private boolean evaluado;
    
    //Acumula el resultado parcial del resultado de la operacion
    private double acumula;

    /**
     * Constructor en caso que la pieza contenga un numero real
     * @param numero 
     * @param nivel Nivel en que se encuentra en la expresion este numero
     */
    
    public Elemento(double numero, int nivel) {
        this.tipo=1;//el numero 1 indica que es un numero
        this.numero = numero;
        this.nivel=nivel;
        this.evaluado=false;
        this.acumula=numero;
    }
/**
 * Constructor en caso que el nodo contenga un operador (+, -, *, ^)
 * @param operador 
 */
    public Elemento(char operador,int nivel) {
        this.tipo=2;//el numero 2 indica un operador
        this.operador = operador;
        this.nivel=nivel;
        this.evaluado=false;
        this.acumula=0;
    }
    /**
     * Constructor en caso de que el nodo contenga una variable
     * @param variable Puede ir de 0 a 25 que representa de a...z
     * @param nivel Nivel en que se encuentra la expresion
     * @return 
     */
    public Elemento(int variable, int nivel) {
        this.tipo=3;
        this.variable = variable;
        this.nivel=nivel;
        this.evaluado=false;
        this.acumula=0;
    }

    public Elemento(int funcion, int nivel,char bandera) {
        this.tipo=4;
        this.nivel = nivel;
        this.funcion = funcion;
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

    public int getVariable() {
        return variable;
    }

    public int getNivel() {
        return nivel;
    }

    public int getFuncion() {
        return funcion;
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
