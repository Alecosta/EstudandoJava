package br.pro.alecosta.exercicio32;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio32 {

    public static void main(String[] args) {
        /*leia três valores inteiros e verifique se eles podem ser os lados de um triângulo. 
          Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno. 
          Propriedade: o comprimento de cada lado de um triângulo 
                       é menor do que a soma dos comprimentos dos outros dois lados. 
          a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais; 
          b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
          c. Triângulo equilátero é também isóscele; 
          d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;*/

        int l1, l2, l3;

        Scanner le = new Scanner(System.in);

        System.out.println("Informe o Lado 1 ");
        l1 = le.nextInt();
        System.out.println("Informe o Lado 2 ");
        l2 = le.nextInt();
        System.out.println("Informe o Lado 3 ");
        l3 = le.nextInt();

        //é um triangulo?
        if (l1 < (l2 + l3) && l2 < (l3 + l1) && l3 < (l1 + l2)) {
            //Sim, podem ser os lados de um triângulo!
            if (l1 == l2 && l2 == l3) {
                //Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais
                System.out.println("equilátero,isóscele");
            } else {
                if (l1 == l2 || l2 == l3 || l3 == l1) {
                    //Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
                    System.out.println("isóscele");
                } else {
                    //Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes
                    System.out.println("escaleno");
                }
            }
        }
    }
}
