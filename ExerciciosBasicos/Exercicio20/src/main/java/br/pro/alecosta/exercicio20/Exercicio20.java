package br.pro.alecosta.exercicio20;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio20 {

    public static void main(String[] args) {
        //calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. 
        //O desconto deverá ser calculado de acordo com o ano do veículo. 
        //Até 2000 - 12% e acima de 2000 - 7%. 
        //O sistema deverá perguntar se deseja continuar calculando desconto 
        //até que a resposta seja: “(N) Não”. 
        // Informar total de carros com ano até 2000 e 
        //total geral;
        
        int anoVeiculo;
        double valorVeiculo = 0d;
        double valorDesconto = 0d;
        double valorPago = 0d;
        int totalCarrosAteAno2000 = 0;
        int totalGeralCarros = 0;
        char continuar = 'S';
        
        Scanner le = new Scanner(System.in);
        
        while (continuar != 'N') {
            System.out.println("Informe o Ano do veiculo:");
            anoVeiculo = le.nextInt();
            System.out.println("Informe o valor do veiculo:");
            valorVeiculo = le.nextDouble();
            
            if (anoVeiculo > 2000) {
                valorDesconto = (valorVeiculo * 7 )/100;
            } else {
                valorDesconto = (valorVeiculo * 12 )/100;
                totalCarrosAteAno2000 = totalCarrosAteAno2000 + 1;
            }
            valorPago = valorVeiculo-valorDesconto;
            
            System.out.println("Valor do Desconto: "+valorDesconto);
            System.out.println("Valor a ser pago pelo cliente: "+valorPago);

            totalGeralCarros = totalGeralCarros + 1;            

            System.out.println("Continuar Calculando desconto? (S)-Sim (N)-Não: ");
            continuar = le.next().toCharArray()[0];
            
        } 
                
        
        System.out.println("Total de carros ate o ano 2000 : "+totalCarrosAteAno2000);
        System.out.println("Total geral de carros : "+totalGeralCarros);
        
        
        
    }
}
