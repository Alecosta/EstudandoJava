package br.pro.alecosta.exercicio9;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio9 {

    public static void main(String[] args) {
        //receba um valor que foi depositado
        //exiba o valor com rendimento após um mês. 
        //Considere fixo o juro da poupança em 0,07% a. m;
        
        double valor = 0d;
        Scanner pegaValor = new Scanner(System.in);
        System.out.println("Informe o valor depositado:");
        valor = pegaValor.nextDouble();
        double valorComRendimento;
        valorComRendimento = valor+(valor*0.07);
        
        System.out.println("Valor com rendimento apos 1 mes: "+valorComRendimento );
    }
}
