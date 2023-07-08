package br.pro.alecosta.exercicio18;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio18 {

    public static void main(String[] args) {
        //Receba a idade de 75 pessoas e mostre mensagem informando 
        //“maior de idade” e “menor de idade” para cada pessoa. 
        //Considere a idade a partir de 18 anos como maior de idade;
        
        int idade = 0;
        
        Scanner ler = new Scanner(System.in);
        
        for (int i = 0;i<75 ;i++) {
        
           System.out.println("Informe a idade :");
           idade = ler.nextInt();
           if (idade >= 18) {
               System.out.println("Maior de Idade");
           } else {
               System.out.println("Menor de Idade");
           }
        }        
    }
}
