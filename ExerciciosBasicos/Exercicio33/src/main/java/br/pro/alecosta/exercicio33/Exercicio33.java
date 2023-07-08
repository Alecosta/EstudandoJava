package br.pro.alecosta.exercicio33;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio33 {

    public static void main(String[] args) {
        /*calcule e exiba o salário de um professor.  
          Sabe-se que o valor da hora/aula segue a tabe la abaixo: 
          a. Professor Nível 1 R$12,00 por hora/aula;
          b. Professor Nível 2 R$17,00 por hora/aula;
          c. Professor Nível 3 R$25,00 por hora/aula.*/
        
        double salario = 0d;
        int horas = 0;
        int nivelProfessor = 0;
        Scanner le = new Scanner(System.in);
        
        System.out.println("Informe o nivel do professor");
        nivelProfessor = le.nextInt();
        
        System.out.println("Informe as horas trabalhadas do professor");
        horas = le.nextInt();
        
        switch (nivelProfessor) {
            case 1 :
                salario = horas * 12;
                break;
            case 2 :
                salario = horas * 17;
                break;
            case 3 :
                salario = horas * 25;
                break;    
        }
        
        System.out.println("Salário do professor "+salario);
             
    }
}
