package br.pro.alecosta.exercicio16poo;

/**
 *
 * @author alecosta
 */
public class Carro {
    private double tanqueConbustivel;
    private double capacidadeTanque;
    private int consumo;
    private double distanciaPecorrida;

    public Carro() {
        this.tanqueConbustivel = 0;
        this.capacidadeTanque = 50d;
        this.consumo = 15;
    }

    public double getTanqueConbustivel() {
        return tanqueConbustivel;
    }

    public void setTanqueConbustivel(double tanqueConbustivel) {
        this.tanqueConbustivel = tanqueConbustivel;
    }

    public void abastecer (int litros) {
        this.tanqueConbustivel = this.tanqueConbustivel + litros; 
    }
    
    public void Mover (double distancia) {
        this.distanciaPecorrida = this.distanciaPecorrida + distancia;
        this.tanqueConbustivel = this.tanqueConbustivel - (distancia / consumo);
    }
    
    public void retornaSituacao () {
        System.out.println( "quantidade de combustível "+ 
                tanqueConbustivel +
                " e a distância total percorrida "+
                distanciaPecorrida);
    }
    
     
    
}
