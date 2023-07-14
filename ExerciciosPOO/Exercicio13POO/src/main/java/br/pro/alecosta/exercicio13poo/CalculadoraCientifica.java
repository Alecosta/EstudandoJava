package br.pro.alecosta.exercicio13poo;

/**
 *
 * @author alecosta
 */
public class CalculadoraCientifica extends Calculadora {
    
    public double raizQuadrada (double valor1) {
        
        return Math.sqrt(valor1);
    }
    
    public double potencia (double valor1, double valor2) {
        return Math.pow(valor1, valor2);
    }
}
