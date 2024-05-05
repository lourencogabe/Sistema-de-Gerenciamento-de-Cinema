package br.edu.up.models;

/**
 * Classe que Representa um sessão.
 */
public class Sessao extends Filme{
    private int codigoSessao;
    private int quantidadeLugaresSessao;
    private int dataSessao;

    /**
     * Construtor Vázio
     */
    public Sessao() {
    }

    /**
     * Construtor com todos os atributos da classe e herança.
     *
     * @param codigoSessao código da sessão.
     * @param quantidadeLugaresSessao quantidade de lugares disponiveis.
     * @param dataSessao data de agendamento da sessão.
     */
    public Sessao(int codigoFilme, String nomeFilme, String generoFilme, int dataEstreiaFilme, String sinopseFilme, int codigoSessao, int quantidadeLugaresSessao, int dataSessao) {
        super(codigoFilme, nomeFilme, generoFilme, dataEstreiaFilme, sinopseFilme);
        this.codigoSessao = codigoSessao;
        this.quantidadeLugaresSessao = quantidadeLugaresSessao;
        this.dataSessao = dataSessao;
    }

    public int getCodigoSessao() {
        return codigoSessao;
    }

    public void setCodigoSessao(int codigoSessao) {
        this.codigoSessao = codigoSessao;
    }

    public int getQuantidadeLugares() {
        return quantidadeLugaresSessao;
    }

    public void setQuantidadeLugares(int quantidadeLugaresSessao) {
        this.quantidadeLugaresSessao = quantidadeLugaresSessao;
    }

    public int getDataSessao() {
        return dataSessao;
    }

    public void setDataSessao(int dataSessao) {
        this.dataSessao = quantidadeLugaresSessao;
    }

    /**
     * Retorna uma representação textual do objeto sessão.
     *
     * @return  Uma string que representa o objeto sessão.
     */
    @Override
    public String toString() {
        return "Sessao{" +
                "nomeFilme=" + super.getNomeFilme() +
                ", codigoFilme=" + super.getCodigoFilme() +
                ", dataSessao=" + dataSessao +
                ", codigoSessao=" + codigoSessao +
                ", quantidadeLugares=" + quantidadeLugaresSessao +
                '}';
    }
}
