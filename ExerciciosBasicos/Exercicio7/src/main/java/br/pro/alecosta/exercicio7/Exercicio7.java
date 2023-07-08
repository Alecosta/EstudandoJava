package br.pro.alecosta.exercicio7;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio7 {

    public static void main(String[] args) {
        //Celsius em graus Fahrenheit.
        //F=(9*C+160) / 5
        double temperaturaCelsius = 0d;
        double temperaturaFaHrenheit = 0d;
        
        Scanner lerTemp = new Scanner(System.in);
        System.out.println("Infomre a Temperatura em Celsius");
        temperaturaCelsius = lerTemp.nextDouble();
        
        temperaturaFaHrenheit = (9*temperaturaCelsius+160)/5;
        
        System.out.println("A temperatura em Fahrenheit é : "+temperaturaFaHrenheit);
    }
}
