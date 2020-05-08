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
public class Conta {
    private int numero;
    private double saldo;
    private double limite;
    private Agencia agencia;

    public Conta(int numero, double saldo, double limite, Agencia agencia) {
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
    
    public void depositar(){
        
    }
    
    private void sacar(){
        
    }
    
    private void imprimirExtrato(){
        
    }
    
    private void consultarSaldo(){
        
    }
}
