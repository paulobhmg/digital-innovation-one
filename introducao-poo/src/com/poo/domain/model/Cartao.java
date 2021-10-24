package com.poo.domain.model;

public class Cartao {

    private String numero;
    private Cliente cliente;

    public Cartao(String numero, Cliente cliente){
        this.numero = numero;
        this.cliente = cliente;
    }

    public String getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String toString(){
        return String.format("Cartão n° %s | %s", numero, cliente.getNome());
    }
}
