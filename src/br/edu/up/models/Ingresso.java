package br.edu.up.models;

import java.util.ArrayList;

/**
 * Classe que Representa um ingresso.
 */
public class Ingresso{
    private int codigoIngresso;
    private float ingressoValor;
    private String dataEmissaoIngresso;

    /**
     * Construtor Vázio
     */


    /**
     * Construtor com todos os atributos da classe e herança.
     *
     * @param codigoIngresso código do ingresso.
     * @param dataEmissaoIngresso data de emissão do ingresso.
     */
    public Ingresso(int codigoIngresso, float ingressoValor, String dataEmissaoIngresso) {
        this.codigoIngresso = codigoIngresso;
        this.dataEmissaoIngresso = dataEmissaoIngresso;
        this.ingressoValor = ingressoValor;
    }

    public int getCodigoIngresso() {
        return codigoIngresso;
    }

    public void setCodigoIngresso(int codigoIngresso) {
        this.codigoIngresso = codigoIngresso;
    }

    public String getDataEmissaoIngresso() {
        return dataEmissaoIngresso;
    }

    public void setDataEmissaoIngresso(String dataEmissaoIngresso) {
        this.dataEmissaoIngresso = dataEmissaoIngresso;
    }

    public float getIngressoValor() {
        return ingressoValor;
    }

    public void setIngressoValor(float ingressoValor) {
        this.ingressoValor = ingressoValor;
    }

    /**
     * Retorna uma representação textual do objeto ingresso.
     *
     * @return  Uma string que representa o objeto ingresso.
     */
    @Override
    public String toString() {
        return "Ingresso{" +
                "codigoIngresso=" + codigoIngresso +
                ", ingressoValor=" + ingressoValor +
                ", dataEmissaoIngresso=" + dataEmissaoIngresso +
                '}';
    }
}
