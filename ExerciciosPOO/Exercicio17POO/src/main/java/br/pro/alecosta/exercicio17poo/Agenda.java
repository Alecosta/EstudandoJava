package br.pro.alecosta.exercicio17poo;

/**
 *
 * @author alecosta
 */
public class Agenda {
    
    private Compromisso[] compromissos;
    private int numeroDoCompromisso;
    
    public Agenda() {
        this.compromissos= new Compromisso[10];
        this.numeroDoCompromisso = 0;
    }
     
    public void  Agendar(String tipo, String data, String nomeParticipante, String telefoneParticipante) {
        Compromisso compromisso = new Compromisso(tipo, data, nomeParticipante, telefoneParticipante);
        compromissos[numeroDoCompromisso] = compromisso;
        numeroDoCompromisso = numeroDoCompromisso + 1;
    }
    
    public void Remover(int numeroComp) {
        if (numeroDoCompromisso == 1) {
            this.compromissos[0] = null;
        } else {
            //mantem unido os elementos.
            this.compromissos[numeroComp] = this.compromissos[numeroDoCompromisso-1];
            this.compromissos[numeroDoCompromisso-1] = null; 
            
        }
        this.numeroDoCompromisso = this.numeroDoCompromisso -1;
    }   
    
    public void Alterar(int numeroComp, String tipo, String data, String nomeParticipante, String telefoneParticipante) {
        Compromisso compromisso = this.compromissos[numeroComp];
        compromisso.setTipo(tipo);
        compromisso.setData(data);
        compromisso.setNomeParticipante(nomeParticipante);
        compromisso.setTelefoneParticipante(telefoneParticipante);
        
    }
    
    public void ExibirPorParticipante(String participante){
        
        for ( int i = 0; i < this.numeroDoCompromisso; i++) {
            if (this.compromissos[i].getNomeParticipante() == participante) {
                System.out.println("Compromisso "+ i );
                System.out.println("Tipo "+compromissos[i].getTipo());
                System.out.println("Data "+compromissos[i].getData());
                System.out.println("Nome "+compromissos[i].getNomeParticipante());
                System.out.println("Telefone "+compromissos[i].getTelefoneParticipante());
                System.out.println("");
            }
        }
        
    }

    public void ExibirPorData(String data){
        for ( int i = 0; i < this.numeroDoCompromisso; i++) {
            if (this.compromissos[i].getData() == data) {
                System.out.println("Compromisso "+ i );
                System.out.println("Tipo "+compromissos[i].getTipo());
                System.out.println("Data "+compromissos[i].getData());
                System.out.println("Nome "+compromissos[i].getNomeParticipante());
                System.out.println("Telefone "+compromissos[i].getTelefoneParticipante());
                System.out.println("");
            }
        }        
    }
    
}
