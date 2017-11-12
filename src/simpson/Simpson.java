/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpson;

/**
 *
 * @author Misael
 */
public class Simpson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double limite_superior = 5;
        double limite_inferior = 3;
        int n = 8;
        double h;
        double pa = limite_inferior;
        double x = 1;
        double f1 = 0, fn = 0, fi;

        double funcao_par = 1, funcao_impar;

        h = (limite_superior - limite_inferior) / n;

        // 4 impares e 2 pares
        double soma_par = 0, soma_impar = 0, soma_extremos = 0;

        System.out.println("h= " + h);
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                pa = pa;
            } else {
                pa = pa + h;
            }

            // System.out.println(i); quando FOR pAR
            if ((i != 0) && (i != n) && ((i % 2) == 0)) {
                System.out.println("I  Par = " + i);
                funcao_par = pa * pa;
                soma_par = soma_par + funcao_par;
                System.out.println("Valor de Cada Funcao Par:" + funcao_par);
                System.out.println("F" + i + " = " + funcao_par);
                System.out.println("Soma De Valores Pares" + soma_par);
            } else {
                // Quando FOR IMPAR
                if ((i != 0) && (i != n)) {
                    System.out.println("I  Impar = " + i);
                    funcao_impar = pa * pa;
                    soma_impar = soma_impar + funcao_impar;

                    System.out.println("Valor de Cada Funcao ImPar:" + funcao_impar);
                    System.out.println("F" + i + " = " + funcao_impar);
                    System.out.println("Soma De Valores Impares" + soma_impar);

                } else {
                    double fo = pa * pa;
                    soma_extremos = soma_extremos + fo;

                    System.out.println("indice" + i);
                    System.out.println("F" + i + " = " + fo);
                    
                    System.out.println("Soma De Extremos" + soma_par);
                }

            }

            double formula = h / 3 * (f1 + fn);
        }

    }

}
