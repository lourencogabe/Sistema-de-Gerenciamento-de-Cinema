package br.edu.up.models;

public class Ingresso extends Sessao{
    private int codigoIngresso;
    private int dataEmissaoIngresso;

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
