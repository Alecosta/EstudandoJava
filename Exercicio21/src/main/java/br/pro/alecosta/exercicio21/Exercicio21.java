package br.pro.alecosta.exercicio21;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio21 {

    public static void main(String[] args) {
        //leia os dados de “N” pessoas (nome, sexo, idade e saúde) e 
        //informe se está apta ou não para cumprir o serviço militar obrigatório. 
        //Informe os totais
        
        String nome;
        char sexo;
        int idade;
        char saude;
        char continuar = 'S';
        int contaAptos = 0;
        int contaInaptos = 0;
        int contaPessoas;
        
        Scanner le = new Scanner(System.in);
        
        while (continuar == 'S' || continuar == 's') {
            System.out.println("Informe o nome: ");
            nome = le.next();
            System.out.println("Informe o sexo: ");
            sexo = le.next().toCharArray()[0];
            System.out.println("Informe a Idade: ");
            idade = le.nextInt();
            System.out.println("Informe o estado de saude (sem doença ou enfermidade (<S/N>: ");
            saude = le.next().toCharArray()[0];
            
            if (idade > 18 && saude == 'S') {
               System.out.println("Está apta para cumprir o serviço militar obrigatório");
               contaAptos = contaAptos + 1;
            } else {
               System.out.println("Não está apta para cumprir o serviço militar obrigatório");
               contaInaptos = contaInaptos +1;
            }
            
            System.out.println("Deseja continuar ? <S/N> ");
            continuar = le.next().toCharArray()[0];
        }
        contaPessoas = contaAptos+contaInaptos;
        System.out.println("Total de pessoas Inaptas Informadas: "+contaInaptos);
        System.out.println("Total de pessoas Aptas Informadas: "+contaAptos);
        System.out.println("Total de pessoas Informadas: "+contaPessoas);
    }
}
