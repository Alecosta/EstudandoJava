package br.pro.alecosta.exercicio5;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio5 {

    public static void main(String[] args) {
        // leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
        // No final informar o nome do aluno e a sua média (aritmética);
        
        String nomeAluno;
        double nota1 = 0d;
        double nota2 = 0d;
        double nota3 = 0d;
        
        Scanner dadosAluno = new Scanner(System.in);
        System.out.println("Informe o nome do Aluno:");
        nomeAluno = dadosAluno.nextLine();
        System.out.println("Informe a nota 1");
        nota1 = dadosAluno.nextDouble();
        System.out.println("Informe a nota 2");
        nota2 = dadosAluno.nextDouble();
        System.out.println("Informe a nota 3");
        nota3 = dadosAluno.nextDouble();
        
        double mediaFinal = (nota1+nota2+nota3)/3;
        System.out.println("O Aluno "+nomeAluno+" esta com a média: "+mediaFinal);
        
                
    }
}
