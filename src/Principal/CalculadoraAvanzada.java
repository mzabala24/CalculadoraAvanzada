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
        Double valor;
        expresion="((5+5)*9/6)^2";
        evaluador.analizar(expresion);
        evaluador.darValorVariable('x', 17.912);
        valor=evaluador.evaluar();
        if(valor.isNaN())
        System.out.println("Error Matematico");
        else
            System.out.println(valor);
    }
    
}
