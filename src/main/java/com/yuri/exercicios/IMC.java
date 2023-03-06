/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.yuri.exercicios;

import static java.lang.Double.parseDouble;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class IMC {

    public static void main(String[] args) {

        String sexo = JOptionPane.showInputDialog("Informe o seu sexo(M ou F)");
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura"));
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso"));
        double imc = peso / (altura * altura);

        if (sexo.equals("F") || sexo.equals("f")) {
            if (imc < 19.1) {
                Object[] options = {"OK,"};
                JOptionPane.showOptionDialog(null, "Você está abaixo do peso", "Aviso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);
            } else if (imc >= 19.1 && imc < 25.8) ;
            {
                Object[] options = {"OK,"};
                JOptionPane.showOptionDialog(null, "Você está no peso normal", "Aviso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);
            }
            if (imc >= 25.8 && imc < 27.3) {
                Object[] options = {"OK,"};
                JOptionPane.showOptionDialog(null, "Você está marginalmente acima do peso", "Aviso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);
            } else if (imc >= 27.3 && imc < 32.3) {
                Object[] options = {"OK,"};
                JOptionPane.showOptionDialog(null, "Você está acima do peso ideal", "Aviso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);
            } else if (imc > 32.3) {
                Object[] options = {"OK,"};
                JOptionPane.showOptionDialog(null, "Você está obeso", "Aviso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);
            }
        } else if (sexo.equals("M") || sexo.equals("m")) {
            if (imc < 20.7) {
                Object[] options = {"OK,"};
                JOptionPane.showOptionDialog(null, "Você está abaixo do peso", "Aviso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);
            } else if (imc >= 20.7 && imc < 26.4) ;
            {
                Object[] options = {"OK,"};
                JOptionPane.showOptionDialog(null, "Você está no peso normal", "Aviso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);
            }
            if (imc >= 26.4 && imc < 27.8) {
                Object[] options = {"OK,"};
                JOptionPane.showOptionDialog(null, "Você está marginalmente acima do peso", "Aviso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);
            } else if (imc >= 27.8 && imc < 31.1) {
                Object[] options = {"OK,"};
                JOptionPane.showOptionDialog(null, "Você está acima do peso ideal", "Aviso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);
            } else if (imc > 31.1) {
                Object[] options = {"OK,"};
                JOptionPane.showOptionDialog(null, "Você está obeso", "Aviso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);
            } else {
                Object[] options = {"OK,"};
                JOptionPane.showOptionDialog(null, "INTERVALO NAO DEFINIDO", "Aviso",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                        null, options, options[0]);
            }

        }

    }
}
