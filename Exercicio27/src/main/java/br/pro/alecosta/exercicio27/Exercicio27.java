package br.pro.alecosta.exercicio27;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio27 {

    public static void main(String[] args) {
        //A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. 
        //Faça um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. 
        //O desconto deverá ser calculado sobre o valor do veículo de acordo com o combustível 
        //(álcool – 25%, gasolina – 21% ou diesel –14%). 
        //Com valor do veículo zero encerra entrada de dados. //
        //Informe total de desconto e total pago pelos clientes;
        
        double valorDesconto = 0d;
        double valorPago = 0d;
        double valorVeiculo = 0d;
        char combustivel; 
        double totalDescontos = 0d;
        double totalPago = 0d;
        
        Scanner ler = new Scanner(System.in);
        
        while (true) {
            
            System.out.println("Informe o valor do Veiculo");
            valorVeiculo = ler.nextDouble();
            if (valorVeiculo == 0) {
                break;
            }
            System.out.println("Informe o commbustivel (A) álcool – (G) gasolina – (D) diesel");
            combustivel = ler.next().toCharArray()[0];
            
            switch (combustivel) {
                case 'A':
                    valorDesconto = (valorVeiculo * 25)/100;
                    break;
                case 'G':
                    valorDesconto = (valorVeiculo * 21)/100;
                    break;
                case 'D':
                    valorDesconto = (valorVeiculo * 14)/100;
                    break;
            }
            valorPago = valorVeiculo-valorDesconto;
            System.out.println("Valor do desconto "+valorDesconto);
            System.out.println("Valor pago "+valorPago);
            
            totalDescontos = totalDescontos + valorDesconto;
            totalPago = totalPago + valorPago;
            
        }
        System.out.println("total de descontos "+totalDescontos);
        System.out.println("total pago "+totalPago); 
        
    }
}
