/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.pro.alecosta.exercico19;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercico19 {

    public static void main(String[] args) {
        //Leia o nome e o sexo de 56 pessoas e 
        //informe o nome e se ela é homem ou mulher. 
        //No final informe total de homens e de mulheres;
        
        int contadorM = 0;
        int contadorF = 0;
        char sexo;
        String nome;
        
        Scanner leia = new Scanner(System.in);
        
        for (int i =0;i < 56; i++) {
            System.out.println("Informe o nome da pessoa:");
            nome =leia.next();
            System.out.println("Informe o sexo da pessoa:");
            sexo =leia.next().charAt(0);
            
            if (sexo == 'M' || sexo == 'm' ) {
                contadorM = contadorM + 1; 
            }
            if (sexo == 'F' || sexo == 'f' ) {
                contadorF = contadorF + 1; 
            }
            
        }
        System.out.println("Foram informados "+contadorM+" homens e "+contadorF+" mulheres");
    }
}
