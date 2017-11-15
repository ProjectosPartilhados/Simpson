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
public class teste {

    public static void main(String[] args) {
        funcao f = new funcao("x^2-2");

        Secante s = new Secante();
        System.out.println(s.raiz(f, 3, 4, 10, 1e-6));

    }
}
