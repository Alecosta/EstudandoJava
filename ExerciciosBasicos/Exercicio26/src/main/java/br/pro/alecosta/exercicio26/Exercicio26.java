package br.pro.alecosta.exercicio26;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio26 {

    public static void main(String[] args) {
        //leia um número de 1 a 5 e escreva por extenso. 
        //Caso o usuário digite um número que não esteja neste intervalo, 
        //exibir a seguinte mensagem: número inválido;
        
        int numero;
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        numero = ler.nextInt();
        switch (numero) {
            case 1:
               System.out.println("hum");
               break;
            case 2:
               System.out.println("dois");
               break;
            case 3:
               System.out.println("três");
               break;
            case 4:
               System.out.println("quatro");
               break;
            case 5:
               System.out.println("cinco");
               break;
            default:
               System.out.println("numero inválido");
        }            
    }
}
