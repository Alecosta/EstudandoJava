package br.pro.alecosta.exercicio31;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio31 {

    public static void main(String[] args) {
        //Dados três valores A, B e C, 
        //em que A e B são números reais e C é um caractere, 
        //pede-se para imprimir o resultado da operação de A por B se C for um símbolo de operador aritmético;
        //caso contrário deve ser impressa uma mensagem de operador não definido. 
        //Tratar erro de divisão por zero;

        int a = 0, b = 0, resultado = 0;
        char c;

        Scanner le = new Scanner(System.in);

        System.out.println("Informe o valor de A (numero) ");
        a = le.nextInt();
        System.out.println("Informe o valor de B (numero) ");
        b = le.nextInt();
        System.out.println("Informe o valor de C (operador aritmetico) ");
        c = le.next().toCharArray()[0];

        switch (c) {
            case '+':
                resultado = a + b;
                System.out.println("resultado da operação de A por B " + resultado);
                break;
            case '-':
                resultado = a - b;
                System.out.println("resultado da operação de A por B " + resultado);
                break;
            case '*':
                resultado = a * b;
                System.out.println("resultado da operação de A por B " + resultado);
                break;
            case '%':
                resultado = a % b;
                System.out.println("resultado da operação de A por B " + resultado);
                break;
            case '/':
                try {
                  resultado = a / b;
                  System.out.println("resultado da operação de A por B " + resultado);
                } catch (ArithmeticException e) {
                   System.out.println("erro de divisão por zero");
                }
            break;
            default:
                System.out.println("operador não definido ");

        }

    }
    
}
