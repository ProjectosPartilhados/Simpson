/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import org.nfunk.jep.JEP;

/**
 *
 * @author Miguel
 */
public class funcao {

    JEP j = new JEP();

    public funcao(String def) {
        j.addVariable("x", 0);
        j.addStandardConstants();
        j.addStandardFunctions();
        j.parseExpression(def);
        // Reportar erro
        if (j.hasError()) {
            System.out.println("ERRO: " + j.getErrorInfo());
        }
    }

}
