package br.pro.alecosta.exercicio3;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio3 {

    public static void main(String[] args) {
        // determinar o consumo médio de um automóvel 
        // fornecida a distância total percorrida pelo automóvel 
        // total de combustível gasto;
        
        double consumoMedio  = 0d;
        double distanciaEmKm = 0d;
        double combustivelEmLitros = 0d;
        
        Scanner pegarDados = new Scanner(System.in);
        System.out.println("Informe a distância total percorrida pelo automóvel (em Km)");
        distanciaEmKm = pegarDados.nextDouble();
        System.out.println("Informe o total de combustível gasto (em litros)");
        combustivelEmLitros = pegarDados.nextDouble();
        consumoMedio = distanciaEmKm / combustivelEmLitros;
        System.out.println("O Consume médio é de "+consumoMedio+"km/l");
        
    }
}
