package br.pro.alecosta.exercicio17poo;

/**
 *
 * @author alecosta
 */
public class Compromisso {
    private String tipo;
    private String data;
    private String nomeParticipante;
    private String telefoneParticipante;

    public Compromisso(String tipo, String data, String nomeParticipante, String telefoneParticipante) {
        this.tipo = tipo;
        this.data = data;
        this.nomeParticipante = nomeParticipante;
        this.telefoneParticipante = telefoneParticipante;
    }

    

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNomeParticipante() {
        return nomeParticipante;
    }

    public void setNomeParticipante(String nomeParticipante) {
        this.nomeParticipante = nomeParticipante;
    }

    public String getTelefoneParticipante() {
        return telefoneParticipante;
    }

    public void setTelefoneParticipante(String telefoneParticipante) {
        this.telefoneParticipante = telefoneParticipante;
    }
    

}
