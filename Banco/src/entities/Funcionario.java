/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author emano
 */
public class Funcionario {
    private String nome;
    private double salario;
    static double valeRefeicao;

    public Funcionario(String nome, double salario, double valeRefeicao) {
        this.nome = nome;
        this.salario = salario;
        this.valeRefeicao = valeRefeicao;
    }
    
    private void aumentarSalario(){
        
    }
    
    static void alterarValeRefeicao(){
        
    }
}
