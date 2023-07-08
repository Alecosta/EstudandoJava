package br.pro.alecosta.exercicio25;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio25 {

    public static void main(String[] args) {
        // leia dois números e identifique se são iguais ou diferentes. 
        //Caso eles sejam iguais imprima uma mensagem dizendo que eles são iguais. 
        //Caso sejam diferentes, informe qual número é o maior, e uma mensagem que são diferentes;
        
        int numero1;
        int numero2;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Informe o primeiro número: ");
        numero1 = ler.nextInt();
        System.out.println("Informe o segundo número: ");
        numero2 =ler.nextInt();
        
        if (numero1 == numero2) {
            System.out.println("os numeros são iguais");
        } else {
            if (numero1 > numero2) {
                System.out.println("O primeiro numero é maior que o segundo");
            } else {
                System.out.println("O segundo numero é maior que o primeiro");
            }
            System.out.println("Logo, os numeros são diferentes!");
        }
    }
}
