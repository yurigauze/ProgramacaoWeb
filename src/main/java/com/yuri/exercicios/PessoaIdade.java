/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.yuri.exercicios;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/**
 *
 * @author yuri_
 */
public class PessoaIdade {

    public static void main(String[] args) {

        int idade = parseInt(JOptionPane.showInputDialog("Informe a sua idade"));

        if (idade >= 0 && idade <= 12) {
            Object[] options = {"OK,"};
            JOptionPane.showOptionDialog(null, "Suponho que seja um Criança!", "Aviso",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                    null, options, options[0]);
        } else if (idade >= 13 && idade <= 17) {
            Object[] options = {"OK,"};
            JOptionPane.showOptionDialog(null, "Suponho que seja um(a) adolecente!", "Aviso",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                    null, options, options[0]);
        } else if (idade >= 18 && idade <= 59) {
            Object[] options = {"OK,"};
            JOptionPane.showOptionDialog(null, "Suponho que seja um(a) Adulto(a)!", "Aviso",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                    null, options, options[0]);
        } else if (idade >= 60) {
            Object[] options = {"OK,"};
            JOptionPane.showOptionDialog(null, "Suponho que seja um(a) Idoso(a)!", "Aviso",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                    null, options, options[0]);
        } else {
            Object[] options = {"OK,"};
            JOptionPane.showOptionDialog(null, "Intervalo de idade não disponivel)!", "Aviso",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                    null, options, options[0]);
        }
    }
}
