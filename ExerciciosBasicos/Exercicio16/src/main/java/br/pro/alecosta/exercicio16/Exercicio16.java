package br.pro.alecosta.exercicio16;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio16 {

    public static void main(String[] args) {
        //Leia o nome e as três notas obtidas por um aluno durante o semestre. 
        // Calcular a sua média (aritmética), 
        // informar o nome e sua menção 
        //aprovado (media >= 7), Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9);
        
        String nome;
        double nota1 = 0d;
        double nota2 = 0d;
        double nota3 = 0d;
        double media = 0d;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println( "Informe o nome do aluno:");
        nome = leia.next();
        System.out.println("Informe a primeira nota: ");
        nota1 = leia.nextDouble();
        System.out.println("Informe a segunda nota: ");
        nota2 = leia.nextDouble();
        System.out.println("Informe a terceira nota: ");
        nota3 = leia.nextDouble();
        
        media = (nota1+nota2+nota3)/3;
        
        if (media >=7) {
            System.out.println("Aprovado");
        } else {
            if (media <=5) {
                System.out.println( "Reprovado");
            } else {
                System.out.println( "Recuperação");
            }            
        }
    }
}
