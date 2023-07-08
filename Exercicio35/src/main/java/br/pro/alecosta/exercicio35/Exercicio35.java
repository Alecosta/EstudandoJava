package br.pro.alecosta.exercicio35;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio35 {

    public static void main(String[] args) {
        /*Faça um algoritmo que calcule o valor da conta de luz de uma pessoa.  
          Sabe-se que o cálculo da conta de luz segue a tabela abaixo: 
          Tipo de Cliente Valor do KW/h
          a. (Residência) 0,60;
          b. (Comércio) 0,48; 
          c. (Indústria) 1,29.*/ 
         
         double valorConta = 0d;
         double kwH = 0d;
         char tipoCliente;
         
         Scanner le = new Scanner(System.in);
         System.out.println("Infomrme o tipo de Cliente "
                 + "a (Residência)"
                 + "b (Comércio)"
                 + "c (Indústria)");
         tipoCliente = le.next().toCharArray()[0];
         System.out.println("Informe os KwH consumidos ");
         kwH = le.nextDouble();
         
         switch (tipoCliente) {
             case 'a' :
                 valorConta = kwH * 0.6;
                 break;
             case 'b' :
                 valorConta = kwH * 0.48;
                 break;
             case 'c' :
                 valorConta = kwH * 1.29;
                 break;
         }
         
         System.out.println("valor da conta de luz "+valorConta);
         
    }
}
