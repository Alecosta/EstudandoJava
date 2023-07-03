package br.pro.alecosta.exercicio8;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio8 {

    public static void main(String[] args) {
        //  apresentação do valor da conversão em real (R$) de um valorlido em dólar (US$).
        // solicitar o valor da cotação do dólar
        // solicitar a quantidade de dólares disponíveis com o usuário;
        float cotacao;
        float valorDolar;
        float valorReal;
        Scanner valores = new  Scanner(System.in);
        System.out.println("Informe a cotação do Dolar US$");
        cotacao =  valores.nextFloat();
        System.out.println("Informe a quantidade disponivel em Dolar US$");
        valorDolar = valores.nextFloat();
        
        valorReal = valorDolar * cotacao;
        System.out.println("Conversao em Real:"+ valorReal);
        
    }
}
