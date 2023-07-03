package br.pro.alecosta.exercicio6;

/**
 *
 * @author alecosta
 */
public class Exercicio6 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = 0;
        
        temp = a;
        a = b;
        b = temp;
        
        System.out.println("Apos inverter, o valor de A é "+a+" e valor de B é "+b);
    }
}
