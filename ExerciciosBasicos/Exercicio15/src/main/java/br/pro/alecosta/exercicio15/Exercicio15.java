/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.pro.alecosta.exercicio15;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio15 {

    public static void main(String[] args) {
        //Receba um número e diga se este número está no intervalo entre 100 e 200;
        
        int numero;
        Scanner leia = new Scanner(System.in);
        System.out.println("Infomre um numero: ");
        numero = leia.nextInt();
        
        if (numero >= 100 && numero <= 200) {
            System.out.println("Esta no intervalo de 100-200");
        } else {
            System.out.println("Esta fora do intervalo de 100-200");
        }
    }
}
