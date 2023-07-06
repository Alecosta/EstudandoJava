package br.pro.alecosta.exercicio24;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio24 {

    public static void main(String[] args) {
        //receba “N” números e mostre positivo, negativo ou zero para cada número;
        
        int numero;
        char continuar = 'S';
        Scanner ler = new Scanner(System.in);
        
        while (continuar == 'S' || continuar == 's') {
        
           System.out.println("Informe numero");
           numero = ler.nextInt();
           
           if (numero > 0) {
               System.out.println("Positivo");
           } else {
               if (numero < 0) {
                   System.out.println("Negativo");
               } else {
                   System.out.println("Zero");
               }
           }
        
           System.out.println("Continuar ? <S/N>");
           continuar = ler.next().toCharArray()[0];
        }
    }
}
