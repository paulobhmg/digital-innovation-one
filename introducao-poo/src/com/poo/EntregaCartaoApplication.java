package com.poo;

import com.poo.domain.model.Cartao;
import com.poo.domain.model.Cliente;
import com.poo.domain.model.Endereco;
import com.poo.exception.DocumentoEmBrancoException;
import com.poo.exception.DocumentoInvalidoException;
import com.poo.exception.EnderecoVazioException;

public class EntregaCartaoApplication {

    public static void main(String[] args) {

        Endereco residencial = new Endereco("Casa", "1", "31111991", "Bairro casa", "Minha cidade");
        Endereco entrega = new Endereco("Entrega", "2", "31111992", "Bairro entrega", "Cidade entrega");
        Endereco trabalho = new Endereco("Trabalho", "3", "31111993", "Bairro trabalho", "Cidade trabalho");

        try {
            Cliente clienteFisico = new Cliente(1L, "Paulo", "11453410635");
            Cliente clienteJuridico = new Cliente(1L, "Tiago", "09988277277221");
            Cartao cartaoCredito = new Cartao("123", clienteFisico);
            Cartao cartaoDebito = new Cartao("12345", clienteJuridico);
            clienteFisico.adicionarEnderecos(residencial, entrega, trabalho);
            clienteJuridico.adicionarEnderecos(residencial, entrega, trabalho);

            System.out.println(clienteFisico);
            System.out.println(clienteJuridico);
            System.out.println(cartaoDebito);
            System.out.println(cartaoCredito);
        } catch (DocumentoEmBrancoException | DocumentoInvalidoException | EnderecoVazioException e){
            System.err.println("Houve um erro no cadastro de clientes: " + e.getMessage());
        }
    }
}

