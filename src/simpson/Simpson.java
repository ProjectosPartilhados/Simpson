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
        double limite_superior = 4;
        double limite_inferior = 1;
        int n = 8;
        double h;
        double pa = limite_inferior;

        h = (limite_superior - limite_inferior) / n;

        System.out.println("h= " + h);
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                pa = pa;
            } else {
                pa = pa + h;
            }
            
           // System.out.println(i);
            if ((i != 0) && (i !=n) && ((i % 2) == 0)) {
             //   System.out.println("I  Par = " + i);
            }
            if ((i != 0) && (i !=n) && ((i % 3) == 0)) {
                  System.out.println("I  Impar = " + i);
            } 

            //System.out.println(pa);

        }

    }

}
