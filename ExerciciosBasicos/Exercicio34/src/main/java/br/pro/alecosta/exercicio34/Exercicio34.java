package br.pro.alecosta.exercicio34;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio34 {

    public static void main(String[] args) {
        /*Elabore um algoritmo que, dada a idade de um nadador. 
          Classifique-o em uma das seguintes categorias: 
          a. Infantil A = 5 - 7 anos;
          b. Infantil B = 8 - 10 anos;
          c. Juvenil A = 11- 13 anos;
          d. Juvenil B = 14 - 17 anos;
          e. Sênior = 18 - 25 anos.
          Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado;*/
        
         int idade;
         
         Scanner le = new Scanner(System.in);
         
         System.out.println("Informe idade do nadador ");
         idade = le.nextInt();
         
         if (idade < 5 && idade >25) {
             System.out.println("idade fora da faixa etária");
         } else {
             if (idade < 7) {
                 System.out.println("Infantil A");
             } else if (idade < 11) {
                 System.out.println("Infantil B");
             } else if (idade < 14) {
                 System.out.println("Juvenil A");
             } else if (idade < 18 ) {
                 System.out.println("Juvenil B");
             } else {
                 System.out.println("Sênior");
             }
         }
        
    }
}
