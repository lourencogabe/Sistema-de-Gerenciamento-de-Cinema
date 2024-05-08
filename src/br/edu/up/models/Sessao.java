package br.edu.up.models;

/**
 * Classe que Representa um sessão.
 */
public class Sessao{
    private int codigoSessao;
    private int quantidadeLugaresSessao;
    private String dataSessao;

    public Sessao() {
    }

    /**
     * Construtor com todos os atributos da classe e herança.
     *
     * @param codigoSessao código da sessão.
     * @param quantidadeLugaresSessao quantidade de lugares disponiveis.
     * @param dataSessao data de agendamento da sessão.
     */
    public Sessao(int codigoSessao, int quantidadeLugaresSessao, String dataSessao) {
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

    public String getDataSessao() {
        return dataSessao;
    }

    public void setDataSessao(String dataSessao) {
        this.dataSessao = dataSessao;
    }

    /**
     * Retorna uma representação textual do objeto sessão.
     *
     * @return  Uma string que representa o objeto sessão.
     */
    @Override
    public String toString() {
        return "Sessao{" +
                "dataSessao=" + dataSessao +
                ", codigoSessao=" + codigoSessao +
                ", quantidadeLugares=" + quantidadeLugaresSessao +
                '}';
    }
}
