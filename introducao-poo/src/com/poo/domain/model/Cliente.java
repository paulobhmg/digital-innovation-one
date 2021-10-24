package com.poo.domain.model;

import com.poo.domain.enumeration.TipoDePessoa;
import com.poo.exception.EnderecoVazioException;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa {

    public Cliente(Long id, String nome, String documento){
        super(id, nome, documento);
        this.enderecos = new ArrayList<Endereco>();
    }

    private final List<Endereco> enderecos;

    public void adicionarEndereco(Endereco endereco){
        if(endereco == null){
            throw new EnderecoVazioException("Endereço não pode ser nulo.");
        }
        enderecos.add(endereco);
    }

    public void adicionarEnderecos(Endereco... enderecos){
        for(Endereco novoEndereco: enderecos){
            adicionarEndereco(novoEndereco);
        }
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    private String getTipoDeDocumento(){
        return tipoDePessoa == TipoDePessoa.FISICA ? "CPF: " : "CNPJ: ";
    }

    private String listaEnderecos(){
        StringBuilder enderecos = new StringBuilder();
        for(Endereco endereco : getEnderecos()){
            enderecos.append(endereco).append("\n");
        }
        return enderecos.toString();
    }

    public String toString(){
        return (
            "---------------------------------------------------------------\n" +
            "Nome: " + nome + ", " + getTipoDeDocumento() + documento + "\n" +
            "Endereços: \n" + listaEnderecos() +
            "---------------------------------------------------------------"
        );
    }
}
