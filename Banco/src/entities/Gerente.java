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
public class Gerente {
    private String nome;
    private double saldo;
    static double valeRefeicao;

    public Gerente(String nome, double saldo, double valeRefeicao) {
        this.nome = nome;
        this.saldo = saldo;
        this.valeRefeicao = valeRefeicao;
    }
    
    private void aumentarSalario(){
        
    }
    
    static void alterarValeRefeicao(double taxa){
        Funcionario.valeRefeicao += Funcionario.valeRefeicao*taxa;
    }
}
