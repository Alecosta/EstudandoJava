package br.pro.alecosta.exercicio17;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio17 {

    public static void main(String[] args) {
        //Leia 80 números e ao final informar quantos número(s) est(á)ão 
        //no intervalo entre 10 (inclusive) e 150 (inclusive);
        
        int contador = 0;
        int numero = 0;
        
        Scanner leia = new Scanner(System.in);
        
        for (int i = 0; i < 80 ;i++) {
          System.out.println("Informe um numero");
          numero = leia.nextInt();
          if (numero >= 10 && numero <= 150 ) {
              contador = contador + 1;
          }
        }
        
        System.out.println(contador +" numeros estão no intervalo entre 10 (inclusive) e 150 (inclusive)");
    }
}
