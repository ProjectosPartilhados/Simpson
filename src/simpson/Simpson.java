/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpson;

import Visao.TelaSimpson;

/**
 *
 * @author Misael
 */
public class Simpson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        double limite_superior = 5;
//        double limite_inferior = 3;
//        int n = 8;
//        double h;
//        double pa = limite_inferior;
//        double x = 1;
//        double f1 = 0, fn = 0, fi;
//
//        double funcao_par = 1, funcao_impar;
//
//        h = (limite_superior - limite_inferior) / n;
//
//        // 4 impares e 2 pares
//        double soma_par = 0, soma_impar = 0, soma_extremos = 0;
//
//        System.out.println("h= " + h);
//        for (int i = 0; i <= n; i++) {
//            if (i == 0) {
//                pa = pa;
//            } else {
//                pa = pa + h;
//            }
//
//            // System.out.println(i); quando FOR pAR
//            if ((i != 0) && (i != n) && ((i % 2) == 0)) {
//                System.out.println("I  Par = " + i);
//                funcao_par = pa * pa;
//                soma_par = soma_par + funcao_par;
//                System.out.println("Valor de Cada Funcao Par:" + funcao_par);
//                System.out.println("F" + i + " = " + funcao_par);
//
//            } else {
//                // Quando FOR IMPAR
//                if ((i != 0) && (i != n)) {
//                    System.out.println("I  Impar = " + i);
//                    funcao_impar = pa * pa;
//                    soma_impar = soma_impar + funcao_impar;
//
//                    System.out.println("Valor de Cada Funcao ImPar:" + funcao_impar);
//                    System.out.println("F" + i + " = " + funcao_impar);
//
//                } else {
//                    double fo = pa * pa;
//                    soma_extremos = soma_extremos + fo;
//
//                    System.out.println("indice" + i);
//                    System.out.println("F" + i + " = " + fo+"\n");
//
//                }
//
//            }
//
//           
//        }
//        
//        System.out.println("h = " + h);
//        System.out.println("Soma De Valores Pares: " + soma_par);
//        System.out.println("Soma De Extremos: " + soma_extremos);
//        System.out.println("Soma De Valores Impares: " + soma_impar+"\n");
//        
//         double formula = (h / 3) * (soma_extremos+ 4*soma_impar+ 2*soma_par);
//         
//         System.out.println("Area da Figura= "+formula);
//         

//        funcao f = new funcao("x^2-2");
//
//        Secante s = new Secante();
//        System.out.println(s.raiz(f, 3, 4, 10, 1e-6));
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
            java.util.logging.Logger.getLogger(TelaSimpson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSimpson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSimpson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSimpson.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        new TelaSimpson().setVisible(true);
    }

}
