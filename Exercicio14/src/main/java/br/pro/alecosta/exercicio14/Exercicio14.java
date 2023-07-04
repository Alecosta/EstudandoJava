/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.pro.alecosta.exercicio14;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio14 {

    public static void main(String[] args) {
        //leia dois valores inteiro distintos e informe qual é o maior;
        int valor1;
        int valor2;
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o primeiro numero: ");
        valor1 = leia.nextInt();
        System.out.println("Informe o segundo numero: ");
        valor2 = leia.nextInt();
        
        if (valor1 > valor2) {
            System.out.println("O maior numero é "+valor1 );
        } else
        if (valor2 > valor1) {
            System.out.println("O maior numero é "+valor2 );
        }
        
    }
}
