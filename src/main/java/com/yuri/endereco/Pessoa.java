/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yuri.endereco;

import com.yuri.endereco.Endereco;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    String nome;
    int idade, id=0;
    List<Endereco> endereco;
    
    public Pessoa(String nome, int idade, String endereco){
    id = id+1;
    this.nome = nome;
    this.idade = idade;
    this.endereco = (List<Endereco>) endereco;
    
}
    
}
