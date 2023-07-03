package br.pro.alecosta.exercicio4;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio4 {

    public static void main(String[] args) {
        // leia o nome de um vendedor
        // o seu salário fixo
        // o total de vendas efetuadas por ele no mês (em dinheiro). 
        // Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas,
        // informar o seu nome, o salário fixo e salário no final do mês;
        String nomeVendedor; 
        Double salarioFixoVendedor = 0d;
        Double totalVendasMes = 0d;
        Scanner dadosVendedor  = new Scanner(System.in);
        System.out.println("Informe o nome de um vendedor");
        nomeVendedor = dadosVendedor.nextLine();
        System.out.println("Informe o seu salário fixo");
        salarioFixoVendedor = dadosVendedor.nextDouble();
        System.out.println("Informe o total de vendas efetuadas por ele no mês (em dinheiro)");
        totalVendasMes = dadosVendedor.nextDouble();
        
        double salarioFinalMesVendedor = salarioFixoVendedor+((totalVendasMes * 15)/100);
        System.out.println("Nome do Vendedor : "+nomeVendedor);
        System.out.println("Salario fixo: "+salarioFixoVendedor);
        System.out.println("Salario no Final do mês: "+salarioFinalMesVendedor);
        
    }
}
