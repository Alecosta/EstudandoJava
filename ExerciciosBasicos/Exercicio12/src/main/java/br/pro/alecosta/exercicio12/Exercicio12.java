/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.pro.alecosta.exercicio12;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio12 {

    public static void main(String[] args) {
        //O custo de um carro novo ao consumidor é 
        //a soma do custo de fábrica mais o percentual do distribuidor e dos impostos aplicados 
        // (primeiro os impostos são aplicados sobre o custo de fábrica, e 
        //  depois o percentual do distribuidor sobre o resultado). 
        //Supondo que o percentual do distribuidor seja de 28% e os impostos 45%, 
        // escreva um algoritmo que leia o custo de fábrica de um carro e 
        // informe o custo ao consumidor do mesmo
        
        double custo;
        double custoConsumidor;
                
        Scanner le = new Scanner(System.in);
        System.out.println("Informe o custo do carro");
        custo = le.nextDouble();
        
        custoConsumidor = custo + (custo *  45)/100;
        custoConsumidor = custoConsumidor + (custoConsumidor * 28)/100;
        
        System.out.println("Custo ao Consumidor:"+custoConsumidor );
        
        
    }
}
