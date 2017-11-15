/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

/**
 *
 * @author Miguel
 */
public class simpson {

    public double raiz(funcao f, double a, double b, int n, double e) {
    double r= Double.NaN;
    double x2= a;
    int k=0;
     while (Math.abs(f.eval(x2))>e && k<n) {            
              x2 =a-f.eval(a)*(b-a)/(f.eval(b)-f.eval(a));
              a=b;
              b=x2;
              k++;
        }
        if (k<n) {
            r=x2;
        }
        return n;
    }
}
