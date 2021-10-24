package com.poo.domain.model;

import com.poo.domain.enumeration.TipoDePessoa;
import com.poo.exception.DocumentoEmBrancoException;
import com.poo.exception.DocumentoInvalidoException;

public abstract class Pessoa {

    private static final int DIGITOS_CPF = 11;
    private static final int DIGITOS_CNPJ = 14;

    protected Long id;
    protected String nome;
    protected String documento;
    protected TipoDePessoa tipoDePessoa;

    public Pessoa(Long id, String nome, String documento){
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        validaDocumento(documento);
    }

    private void validaDocumento(String documento){
        if(documento == null || documento.isEmpty()){
            throw new DocumentoEmBrancoException("Documento não pode ser vazio.");
        }
        if(documento.length() == DIGITOS_CPF){
            tipoDePessoa = TipoDePessoa.FISICA;
        }else if(documento.length() == DIGITOS_CNPJ){
            tipoDePessoa = TipoDePessoa.JURIDICA;
        }else{
            throw new DocumentoInvalidoException("Número de documento inválido.");
        }
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public TipoDePessoa getTipoDePessoa() {
        return tipoDePessoa;
    }

    private void setTipoDePessoa(TipoDePessoa tipoDePessoa) {
        this.tipoDePessoa = tipoDePessoa;
    }
}
