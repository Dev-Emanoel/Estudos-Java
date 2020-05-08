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
public class Cliente {
    private int codigo;
    private String name;
    private Conta[] conta;

    public Cliente(int codigo, String name, Conta[] conta) {
        this.codigo = codigo;
        this.name = name;
        this.conta = conta;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getName() {
        return name;
    }

    public Conta[] getConta() {
        return conta;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConta(Conta[] conta) {
        this.conta = conta;
    }
    
    
}
