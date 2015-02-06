/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Principal;

import Operaciones.Expresion;



/**
 *
 * @author Administrator
 */
public class CalculadoraAvanzada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Expresion evaluador = new Expresion();
        String expresion;
        double valor;
        expresion="3.398+1.609/5.478-3.529+7^3*4.248";
        evaluador.analizar(expresion);
        valor=evaluador.evaluar();
        System.out.println(valor);
    }
    
}
