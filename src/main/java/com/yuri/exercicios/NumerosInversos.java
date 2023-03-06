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
public class NumerosInversos {
    public static void main(String[] args) {

    String numeros = JOptionPane.showInputDialog("Informe numeros separado por virgula (Sem espaços)");
    String[] numero = numeros.split(",");
    for (int i = numero.length-1; i >=0; i--) {
             System.out.println(numero[i]);   
            }
    }
}
