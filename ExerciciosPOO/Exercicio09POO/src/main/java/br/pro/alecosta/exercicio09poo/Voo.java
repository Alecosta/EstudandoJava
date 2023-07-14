package br.pro.alecosta.exercicio09poo;

/**
 *
 * @author alecosta
 */
public class Voo {
    
    private Data data;
    private int hora;
    private int minuto;
    private int numeroPassageiros;
    private int numeroVoo;
    private boolean[] assentos;

    public Voo(Data data, int hora, int minuto, int numeroVoo) {
        this.data = data;
        this.hora = hora;
        this.minuto = minuto;
        this.numeroVoo = numeroVoo;
        this.assentos = new boolean[100];
        
        
    }
    
    public int ProximoLivre() {
        for (int i = 0; i < 100; i++) {
            if (!this.assentos[i]) {
                return i + 1;
            } 
        }
        return 0;
    }
    
    public boolean Verifica(int assento) {
        return this.assentos[assento-1];
    } 
    
    public boolean Ocupa(int assento) {
        
        if (!this.Verifica(assento)) {
            this.assentos[assento-1] = true; 
            return true;
        } 

        return false;
        
    }
    
    public int Vagas () {
        
        int totalAssentosLivres = 0;
        
        for (boolean assentoOcupado: this.assentos ) {
            if (!assentoOcupado) {
                totalAssentosLivres = totalAssentosLivres + 1;  
            }
        }
        return totalAssentosLivres;
    }   

    public int getNumeroVoo() {
        return numeroVoo;
    }
    
}
