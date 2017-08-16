package com.vitormarcal.marcalmoney.api.model;

import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

@Embeddable
public class Endereco {

    @Size(max = 30)
    private String logradouro;

    @Size(max = 30)
    private String numero;

    @Size(max = 30)
    private String complemento;

    @Size(max = 30)
    private String bairro;

    @Size(max = 8)
    private String cep;

    @Size(max = 30)
    private String cidade;

    @Size(max = 30)
    private String estado;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLogradouro() {

        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
}
