package br.edu.up.models;

/**
 * Classe que Representa um cliente.
 */
public class Cliente{
    public String nomeCliente;
    public int documentoCliente;
    public int idadeCliente;
    public String contatoCliente;

    /**
     * Construtor Vázio
     */
    public Cliente() {
    }

    /**
     * Construtor com todos os atributos da classe.
     *
     * @param nomeCliente nome do cliente
     * @param documentoCliente documento cliente.
     * @param idadeCliente idade do cliente.
     * @param contatoCliente contato do cliente.
     */
    public Cliente(String nomeCliente, int documentoCliente, int idadeCliente, String contatoCliente) {
        this.nomeCliente = nomeCliente;
        this.documentoCliente = documentoCliente;
        this.idadeCliente = idadeCliente;
        this.contatoCliente = contatoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(int documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public int getIdadeCliente() {
        return idadeCliente;
    }

    public void setIdadeCliente(int idadeCliente) {
        this.idadeCliente = idadeCliente;
    }

    public String getContatoCliente() {
        return contatoCliente;
    }

    public void setContatoCliente(String contatoCliente) {
        this.contatoCliente = contatoCliente;
    }

    /**
     * Retorna uma representação textual do objeto cliente.
     *
     * @return  Uma string que representa o objeto cliente.
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nomeCliente='" + nomeCliente + '\'' +
                ", documentoCliente=" + documentoCliente +
                ", idadeCliente=" + idadeCliente +
                ", contatoCliente='" + contatoCliente + '\'' +
                '}';
    }
}
