package br.pro.alecosta.exercicio11;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio11 {

    public static void main(String[] args) {
      //receba o preço de custo de um produto
      //mostre o valor de venda. 
      //Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário; 
      
      double precoCusto = 0d;
      double percentual = 0d;
      double valorVenda = 0d;
      
      Scanner pegar = new Scanner(System.in);
        
      System.out.println("Informe o preco de custo:");
      precoCusto = pegar.nextDouble();
      
      System.out.println("Informe o percentual de custo:");
      percentual = pegar.nextDouble();
      
      valorVenda = precoCusto + (precoCusto * percentual ) / 100;
      System.out.println("O preco de venda é:"+valorVenda);
       
              
    }
}
