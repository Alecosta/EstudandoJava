package br.pro.alecosta.exercicio30;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio30 {

    public static void main(String[] args) {
        //Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
        
        int numero1;
        int numero2;
        int numero3;
        int numeroAux;
        
        Scanner le = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        numero1 = le.nextInt();
        System.out.println("Informe o segundo numero: ");
        numero2 = le.nextInt();
        System.out.println("Informe o terceiro numero: ");
        numero3 = le.nextInt();
        
        if (numero1 > numero2) {
            numeroAux = numero1;
            numero1 = numero2;
            numero2 = numeroAux;
        } 
        
        if (numero1 > numero3) {
            numeroAux = numero1;
            numero1 = numero3;
            numero3 = numeroAux;
        }
        
        if (numero2 > numero3) {
            numeroAux = numero2;
            numero2 = numero3;
            numero3 = numeroAux;
        }
        
        System.out.println("em ordem crescente "+numero1+", "+numero2+" e "+numero3);
    }
}
