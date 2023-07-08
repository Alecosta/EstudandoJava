package br.pro.alecosta.exercicio13;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio13 {

    public static void main(String[] args) {
        //receba um número e mostre uma mensagem caso este número seja maior que 10
        int numero;
        Scanner le = new Scanner(System.in);
        System.out.println("Informe um numero");
        numero = le.nextInt();
        
        if ( numero > 10 ) {
            System.out.println("numero maior que 10!");
        
        }
    }
}
