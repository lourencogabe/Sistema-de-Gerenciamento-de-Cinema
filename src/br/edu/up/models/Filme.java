package br.edu.up.models;

/**
 * Classe que Representa um filme.
 */
public class Filme {
    private String codigoFilme;
    private String nomeFilme;
    private String generoFilme;
    private String dataEstreiaFilme;
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
    public Filme(String codigoFilme, String nomeFilme, String generoFilme, String dataEstreiaFilme, String sinopseFilme) {
        this.codigoFilme = codigoFilme;
        this.nomeFilme = nomeFilme;
        this.generoFilme = generoFilme;
        this.dataEstreiaFilme = dataEstreiaFilme;
        this.sinopseFilme = sinopseFilme;
    }

    public String getCodigoFilme() {
        return codigoFilme;
    }

    public void setCodigoFilme(String codigoFilme) {
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

    public String getDataEstreiaFilme() {
        return dataEstreiaFilme;
    }

    public void setDataEstreiaFilme(String dataEstreiaFilme) {
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
