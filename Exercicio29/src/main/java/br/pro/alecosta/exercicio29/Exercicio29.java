package br.pro.alecosta.exercicio29;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio29 {

    public static void main(String[] args) {
        // receba o número do mês e mostre o mês correspondente. Valide mês inválido;
        
        int mes;
        String mesCorresp ="";
        
        Scanner le = new Scanner(System.in);
        
        System.out.println("Informe o número do mês");
        mes = le.nextInt();
        
        switch (mes) {
            case 1:
                 mesCorresp = "Janeiro";
                 break;
            case 2:
                 mesCorresp = "Fevereiro";
                 break;
            case 3:
                 mesCorresp = "Março";
                 break;
            case 4:
                 mesCorresp = "Abril";
                 break;
            case 5:
                 mesCorresp = "Maio";
                 break;
            case 6:
                 mesCorresp = "Junho";
                 break;
            case 7:
                 mesCorresp = "Julho";
                 break;
            case 8:
                 mesCorresp = "Agosto";
                 break;
            case 9:
                 mesCorresp = "Setembro";
                 break;
            case 10:
                 mesCorresp = "Outubro";
                 break;
            case 11:
                 mesCorresp = "Novembro";
                 break;
            case 12:
                 mesCorresp = "Dezembro";
                 break;
                 
        }
        
        System.out.println("mês correspondente : "+mesCorresp);
    }
}
