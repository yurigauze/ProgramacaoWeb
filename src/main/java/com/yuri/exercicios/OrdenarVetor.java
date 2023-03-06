/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yuri.exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author yuri_
 */
public class OrdenarVetor {

    public static void main(String[] args) {
        String string = JOptionPane.showInputDialog("Informe 3 numeros separado por virgula (Sem espaços)");
        String[] valores = string.split(",");
        int[] numeros = new int[3];


        for (int i = 0; i < valores.length; ++i) {
            numeros[i] = Integer.parseInt(valores[i]);
        }

        for (int i = 0; i < 3; i++) {
            for (int y = i + 1; y < 3; ++y) {
                if (numeros[i] > numeros[y]) {
                    int temp = numeros[i];
                    numeros[i] = numeros[y];
                    numeros[y] = temp;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(numeros[i]);
        }
    }
}
