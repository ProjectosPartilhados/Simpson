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

        double funcao_par = 1, funcao_impar = 1;

        h = (limite_superior - limite_inferior) / n;

        // 4 impares e 2 pares
        double formula = h / 3 * (f1 + fn);

        System.out.println("h= " + h);
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                pa = pa;
            } else {
                pa = pa + h;
            }

            // System.out.println(i); quando FOR pAR
            if ((i != 0) && (i != n) && ((i % 2) == 0)) {
//               System.out.println("I  Par = " + i);
                funcao_par = pa * pa;
//                System.out.println("Valor de Cada Funcao Par:" + funcao_par);
            } else {
                // Quando FOR IMPAR
                if ((i != 0) && (i != n)) {
//                    System.out.println("I  Impar = " + i);
                    funcao_impar = pa * pa;
                    System.out.println("Valor de Cada Funcao ImPar:" + funcao_par);

                }

            }

//            System.out.println("Pa" + pa);
            //double funcao = (pa * pa);
//            System.out.println("Valor de Cada Funcao Par:" + funcao_par);
        }

    }

}
