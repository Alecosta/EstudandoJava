package br.pro.alecosta.exercicio23;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio23 {

    public static void main(String[] args) {
        //receba um número e mostre uma mensagem caso este número seja 
        //maior que 80, menor que 25 ou igual a 40;
        
        int numero;
        
        System.out.println("Informe um numero ");
        
        Scanner leNumero = new Scanner(System.in);
        numero = leNumero.nextInt();
        
        if (numero > 80 || numero < 25 || numero == 40 ) {
            System.out.println("Numero atende o critério ");
        }
        
    }
}
