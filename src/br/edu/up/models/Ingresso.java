package br.edu.up.models;

/**
 * Classe que Representa um ingresso.
 */
public class Ingresso extends Sessao{
    private int codigoIngresso;
    private int dataEmissaoIngresso;

    /**
     * Construtor Vázio
     */
    public Ingresso() {
    }

    /**
     * Construtor com todos os atributos da classe e herança.
     *
     * @param codigoIngresso código do ingresso.
     * @param dataEmissaoIngresso data de emissão do ingresso.
     */
    public Ingresso(int codigoFilme, String nomeFilme, String generoFilme, int dataEstreiaFilme, String sinopseFilme, int codigoSessao, int quantidadeLugaresSessao, int dataSessao, int codigoIngresso, int dataEmissaoIngresso) {
        super(codigoFilme, nomeFilme, generoFilme, dataEstreiaFilme, sinopseFilme, codigoSessao, quantidadeLugaresSessao, dataSessao);
        this.codigoIngresso = codigoIngresso;
        this.dataEmissaoIngresso = dataEmissaoIngresso;
    }

    public int getCodigoIngresso() {
        return codigoIngresso;
    }

    public void setCodigoIngresso(int codigoIngresso) {
        this.codigoIngresso = codigoIngresso;
    }

    public int getDataEmissaoIngresso() {
        return dataEmissaoIngresso;
    }

    public void setDataEmissaoIngresso(int dataEmissaoIngresso) {
        this.dataEmissaoIngresso = dataEmissaoIngresso;
    }

    /**
     * Retorna uma representação textual do objeto ingresso.
     *
     * @return  Uma string que representa o objeto ingresso.
     */
    @Override
    public String toString() {
        return "Ingresso{" +
                "nomeFilme=" +super.getNomeFilme()+
                ", codigoIngresso=" + codigoIngresso +
                ", dataEmissaoIngresso=" + dataEmissaoIngresso +
                ", dataSessao=" + super.getDataSessao() +
                '}';
    }
}
