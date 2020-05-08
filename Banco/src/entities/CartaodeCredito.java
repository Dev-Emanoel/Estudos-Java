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
public class CartaodeCredito {
    private int numero;
    private String dataExpedicao;
    private Cliente cliente;

    public CartaodeCredito(int numero, String dataExpedicao, Cliente cliente) {
        this.numero = numero;
        this.dataExpedicao = dataExpedicao;
        this.cliente = cliente;
    }
    
    
}
