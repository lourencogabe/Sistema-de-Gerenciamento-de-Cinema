package br.edu.up.models;

/**
 * Classe que Representa um filme.
 */
public class Filme {
    private int codigoFilme;
    private String nomeFilme;
    private String generoFilme;
    private int dataEstreiaFilme;
    private String sinopseFilme;

    /**
     * Construtor Vázio
     */
    public Filme() {
    }

    /**
     * Construtor com todos os atributos.
     *
     * @param codigoFilme código único do filme.
     * @param nomeFilme nome do filme.
     * @param generoFilme gênero do filme.
     * @param dataEstreiaFilme data de estreia do filme.
     * @param sinopseFilme sinopse do filme.
     */
    public Filme(int codigoFilme, String nomeFilme, String generoFilme, int dataEstreiaFilme, String sinopseFilme) {
        this.codigoFilme = codigoFilme;
        this.nomeFilme = nomeFilme;
        this.generoFilme = generoFilme;
        this.dataEstreiaFilme = dataEstreiaFilme;
        this.sinopseFilme = sinopseFilme;
    }

    public int getCodigoFilme() {
        return codigoFilme;
    }

    public void setCodigoFilme(int codigoFilme) {
        this.codigoFilme = codigoFilme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getGeneroFilme() {
        return generoFilme;
    }

    public void setGeneroFilme(String generoFilme) {
        this.generoFilme = generoFilme;
    }

    public int getDataEstreiaFilme() {
        return dataEstreiaFilme;
    }

    public void setDataEstreiaFilme(int dataEstreiaFilme) {
        this.dataEstreiaFilme = dataEstreiaFilme;
    }

    public String getSinopseFilme() {
        return sinopseFilme;
    }

    public void setSinopseFilme(String sinopseFilme) {
        this.sinopseFilme = sinopseFilme;
    }

    /**
     * Retorna uma representação textual do objeto Filme.
     *
     * @return  Uma string que representa o objeto Filme.
     */
    @Override
    public String toString() {
        return "Filme{" +
                "codigoFilme=" + codigoFilme +
                ", nomeFilme='" + nomeFilme + '\'' +
                ", generoFilme='" + generoFilme + '\'' +
                ", dataEstreiaFilme=" + dataEstreiaFilme +
                ", sinopseFilme='" + sinopseFilme + '\'' +
                '}';
    }
}
