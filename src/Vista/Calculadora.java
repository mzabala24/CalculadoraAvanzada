/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Operaciones.Expresion;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtExpresion = new javax.swing.JTextField();
        btnCero = new javax.swing.JButton();
        btnSiete = new javax.swing.JButton();
        btnOcho = new javax.swing.JButton();
        btnNueve = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        btnCinco = new javax.swing.JButton();
        btnSeis = new javax.swing.JButton();
        btnMultiplicacion = new javax.swing.JButton();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnSeno = new javax.swing.JButton();
        btnMenos = new javax.swing.JButton();
        btnPunto = new javax.swing.JButton();
        btnCierraParentesis = new javax.swing.JButton();
        btnPotencia = new javax.swing.JButton();
        btnRaiz = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btnArcoSeno = new javax.swing.JButton();
        btnArcoCos = new javax.swing.JButton();
        btnArcoTan = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnMas = new javax.swing.JButton();
        btnIgual1 = new javax.swing.JButton();
        btnAbreParentesis = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblExpresion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDesarrollo = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        txtExpresion.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtExpresion);
        txtExpresion.setBounds(10, 10, 450, 30);

        btnCero.setText("0");
        btnCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCeroActionPerformed(evt);
            }
        });
        jPanel1.add(btnCero);
        btnCero.setBounds(10, 200, 110, 30);

        btnSiete.setText("7");
        btnSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSieteActionPerformed(evt);
            }
        });
        jPanel1.add(btnSiete);
        btnSiete.setBounds(10, 50, 50, 30);

        btnOcho.setText("8");
        btnOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOchoActionPerformed(evt);
            }
        });
        jPanel1.add(btnOcho);
        btnOcho.setBounds(70, 50, 50, 30);

        btnNueve.setText("9");
        btnNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueveActionPerformed(evt);
            }
        });
        jPanel1.add(btnNueve);
        btnNueve.setBounds(130, 50, 50, 30);

        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        jPanel1.add(btnDivision);
        btnDivision.setBounds(190, 50, 50, 30);

        btnCuatro.setText("4");
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        jPanel1.add(btnCuatro);
        btnCuatro.setBounds(10, 100, 50, 30);

        btnCinco.setText("5");
        btnCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCincoActionPerformed(evt);
            }
        });
        jPanel1.add(btnCinco);
        btnCinco.setBounds(70, 100, 50, 30);

        btnSeis.setText("6");
        btnSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeisActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeis);
        btnSeis.setBounds(130, 100, 50, 30);

        btnMultiplicacion.setText("*");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });
        jPanel1.add(btnMultiplicacion);
        btnMultiplicacion.setBounds(190, 100, 50, 30);

        btnUno.setText("1");
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        jPanel1.add(btnUno);
        btnUno.setBounds(10, 150, 50, 30);

        btnDos.setText("2");
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        jPanel1.add(btnDos);
        btnDos.setBounds(70, 150, 50, 30);

        btnTres.setText("3");
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        jPanel1.add(btnTres);
        btnTres.setBounds(130, 150, 50, 30);

        btnSeno.setText("sin");
        btnSeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSenoActionPerformed(evt);
            }
        });
        jPanel1.add(btnSeno);
        btnSeno.setBounds(250, 200, 60, 30);

        btnMenos.setText("-");
        btnMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenosActionPerformed(evt);
            }
        });
        jPanel1.add(btnMenos);
        btnMenos.setBounds(190, 150, 50, 30);

        btnPunto.setText(".");
        btnPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntoActionPerformed(evt);
            }
        });
        jPanel1.add(btnPunto);
        btnPunto.setBounds(130, 200, 50, 30);

        btnCierraParentesis.setText(")");
        btnCierraParentesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCierraParentesisActionPerformed(evt);
            }
        });
        jPanel1.add(btnCierraParentesis);
        btnCierraParentesis.setBounds(400, 150, 60, 30);

        btnPotencia.setText("^");
        btnPotencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPotenciaActionPerformed(evt);
            }
        });
        jPanel1.add(btnPotencia);
        btnPotencia.setBounds(250, 50, 60, 30);

        btnRaiz.setText("sqrt");
        btnRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRaizActionPerformed(evt);
            }
        });
        jPanel1.add(btnRaiz);
        btnRaiz.setBounds(320, 50, 70, 30);

        btnCos.setText("cos");
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });
        jPanel1.add(btnCos);
        btnCos.setBounds(250, 150, 60, 30);

        btnTan.setText("tan");
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });
        jPanel1.add(btnTan);
        btnTan.setBounds(250, 100, 60, 30);

        btnArcoSeno.setText("sin^-1");
        btnArcoSeno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArcoSenoActionPerformed(evt);
            }
        });
        jPanel1.add(btnArcoSeno);
        btnArcoSeno.setBounds(320, 200, 70, 30);

        btnArcoCos.setText("cos^-1");
        btnArcoCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArcoCosActionPerformed(evt);
            }
        });
        jPanel1.add(btnArcoCos);
        btnArcoCos.setBounds(320, 150, 70, 30);

        btnArcoTan.setText("tan^-1");
        btnArcoTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArcoTanActionPerformed(evt);
            }
        });
        jPanel1.add(btnArcoTan);
        btnArcoTan.setBounds(320, 100, 70, 30);

        btnLog.setText("1/x");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });
        jPanel1.add(btnLog);
        btnLog.setBounds(400, 50, 60, 30);

        btnMas.setText("+");
        btnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMasActionPerformed(evt);
            }
        });
        jPanel1.add(btnMas);
        btnMas.setBounds(190, 200, 50, 30);

        btnIgual1.setText("=");
        btnIgual1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIgual1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnIgual1);
        btnIgual1.setBounds(400, 200, 60, 30);

        btnAbreParentesis.setText("(");
        btnAbreParentesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbreParentesisActionPerformed(evt);
            }
        });
        jPanel1.add(btnAbreParentesis);
        btnAbreParentesis.setBounds(400, 100, 60, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Solución");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(480, 40, 110, 20);

        lblExpresion.setText("Expresión");
        jPanel1.add(lblExpresion);
        lblExpresion.setBounds(470, 70, 160, 14);

        txtDesarrollo.setColumns(20);
        txtDesarrollo.setRows(5);
        jScrollPane1.setViewportView(txtDesarrollo);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(470, 90, 166, 140);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(659, 295));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCeroActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"0");
    }//GEN-LAST:event_btnCeroActionPerformed

    private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+".");
    }//GEN-LAST:event_btnPuntoActionPerformed

    private void btnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMasActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"+");
    }//GEN-LAST:event_btnMasActionPerformed

    private void btnSenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSenoActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"sin(");
    }//GEN-LAST:event_btnSenoActionPerformed

    private void btnArcoSenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArcoSenoActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"asn(");
    }//GEN-LAST:event_btnArcoSenoActionPerformed

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"1");
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"2");
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"3");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"4");
    }//GEN-LAST:event_btnCuatroActionPerformed

    private void btnCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCincoActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"5");
    }//GEN-LAST:event_btnCincoActionPerformed

    private void btnSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeisActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"6");
    }//GEN-LAST:event_btnSeisActionPerformed

    private void btnSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSieteActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"7");
    }//GEN-LAST:event_btnSieteActionPerformed

    private void btnOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOchoActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"8");
    }//GEN-LAST:event_btnOchoActionPerformed

    private void btnNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueveActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"9");
    }//GEN-LAST:event_btnNueveActionPerformed

    private void btnMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenosActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"-");
    }//GEN-LAST:event_btnMenosActionPerformed

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"*");
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivisionActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"/");
    }//GEN-LAST:event_btnDivisionActionPerformed

    private void btnPotenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPotenciaActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"^");
    }//GEN-LAST:event_btnPotenciaActionPerformed

    private void btnArcoCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArcoCosActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"acn(");
    }//GEN-LAST:event_btnArcoCosActionPerformed

    private void btnArcoTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArcoTanActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"atn(");
    }//GEN-LAST:event_btnArcoTanActionPerformed

    private void btnRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRaizActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"sqr(");
    }//GEN-LAST:event_btnRaizActionPerformed

    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"log(");
    }//GEN-LAST:event_btnLogActionPerformed

    private void btnAbreParentesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbreParentesisActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"(");
    }//GEN-LAST:event_btnAbreParentesisActionPerformed

    private void btnCierraParentesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCierraParentesisActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+")");
    }//GEN-LAST:event_btnCierraParentesisActionPerformed

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"tan(");
    }//GEN-LAST:event_btnTanActionPerformed

    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
        // TODO add your handling code here:
        txtExpresion.setText(txtExpresion.getText()+"cos(");
    }//GEN-LAST:event_btnCosActionPerformed

    private void btnIgual1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgual1ActionPerformed
        // TODO add your handling code here:
        
        Expresion evaluador = new Expresion();
        String expresion;
        Double valor;
        if(txtExpresion.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Ingrese datos");
        }else{
        expresion=txtExpresion.getText();
        lblExpresion.setText(expresion);
        evaluador.analizar(expresion);
        evaluador.darValorVariable('x', 17.912);
        valor=evaluador.evaluar();
        if(valor.isNaN())
        System.out.println("Error Matematico");
        else             
            txtExpresion.setText(""+valor);
        
            txtDesarrollo.setText(evaluador.retornaPasos());
        System.out.println(valor);
        }
        
    }//GEN-LAST:event_btnIgual1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbreParentesis;
    private javax.swing.JButton btnArcoCos;
    private javax.swing.JButton btnArcoSeno;
    private javax.swing.JButton btnArcoTan;
    private javax.swing.JButton btnCero;
    private javax.swing.JButton btnCierraParentesis;
    private javax.swing.JButton btnCinco;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnIgual1;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMas;
    private javax.swing.JButton btnMenos;
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JButton btnNueve;
    private javax.swing.JButton btnOcho;
    private javax.swing.JButton btnPotencia;
    private javax.swing.JButton btnPunto;
    private javax.swing.JButton btnRaiz;
    private javax.swing.JButton btnSeis;
    private javax.swing.JButton btnSeno;
    private javax.swing.JButton btnSiete;
    private javax.swing.JButton btnTan;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblExpresion;
    private javax.swing.JTextArea txtDesarrollo;
    private javax.swing.JTextField txtExpresion;
    // End of variables declaration//GEN-END:variables
}
