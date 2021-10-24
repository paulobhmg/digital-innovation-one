package com.poo.domain.model;

public class Endereco {

    private String logradouro;
    private String numero;
    private String cep;
    private String bairro;
    private String cidade;

    public Endereco(String logradouro, String numero, String cep, String bairro, String cidade) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.cep = cep;
        this.bairro = bairro;
        this.cidade = cidade;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String toString(){
        return String.format("Logradouro: %s, n°: %s, bairro: %s, CEP: %s, cidade: %s",
            logradouro, numero, bairro, cep, cidade
        );
    }
}
