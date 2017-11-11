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
        double x=1;
        double f1=0 ,fn=0, fi;

        h = (limite_superior - limite_inferior) / n;
        
         // 4 impares e 2 pares
         
        
         double formula =h/3*(f1+fn);

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
            }else{
                if ((i != 0) &&(i !=n)) {
                    //System.out.println("I  Impar = " + i);
                }
               
            }
           
            //System.out.println(pa);
             // double funcao = 1/x; 
            double x2=0 ;
           // x2=limite_inferior;
            
           x2= x2+ limite_inferior + h;
            System.out.println("X= "+x2);

        }

    }

}
