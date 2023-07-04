package br.pro.alecosta.exercicio10;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio10 {

    public static void main(String[] args) {
      //A Loja Mamão com Açúcar está vendendo seus produtos em5(cinco)prestações sem juros.
      //Faça um algoritmo que receba um valor de uma compra e mostre o valor das prestações;
      
      double valorCompra;
      double valorPrestacao;
      Scanner pegaValorCompra = new Scanner(System.in);
      
      System.out.println("Informe o valor da compra:");
      valorCompra = pegaValorCompra.nextDouble();
       
      valorPrestacao = valorCompra / 5;
      
      System.out.println("Valor das prestações : "+ valorPrestacao);
      
      
    }
}
