package br.pro.alecosta.exercicio28;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio28 {

    public static void main(String[] args) {
        /*
        Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários 
        de acordo com os seguintes critérios: 
          a. 50% para aqueles que ganham menos do que três salários mínimos;
          b. 20% para aqueles que ganham entre três até dez salários mínimos;  
          c. 15% para aqueles que ganham acima de dez até vinte salários mínimos; 
          d. 10% para os demais funcionários.
       Leia o nome do funcionário, seu salário e o valor do salário mínimo. 
       Calcule o seu novo salário reajustado. 
       Escrever o nome do funcionário, o reajuste e seu novo salário. 
       Calcule quanto à empresa vai aumentar sua folha de pagamento;       
        */
        
       String nome;
       double salario = 0d;
       double salarioMinimo = 0d;
       double salarioReajustado = 0d;
       double totalAumentoFolha = 0d;
       int percReajuste = 0;
       Scanner ler = new Scanner(System.in);
        
       System.out.println("Infomrme o Salario Minimo ");
       salarioMinimo = ler.nextDouble();
       for (int i =1; i <= 584; i++ ) {
          System.out.println("Informe o nome do funcionário");
          nome = ler.next();
          System.out.println("informe o salario do funcionario");
          salario = ler.nextDouble();
         
          if (salario < (3 * salarioMinimo)) {
              percReajuste = 50;
          } else { 
              if (salario < (10 * salarioMinimo)) {
                 percReajuste = 20;
              } else {
                  if (salario < (10 * salarioMinimo)) {
                     percReajuste = 15; 
                  } else {
                      percReajuste = 10;
                  }
              }    
          }
          
          salarioReajustado = salario + (salario*percReajuste)/100;
          totalAumentoFolha = totalAumentoFolha + (salarioReajustado-salario);
          System.out.println("O funcionário"+nome+", teve um reajuste de "+percReajuste+"% e seu novo salário será "+salarioReajustado );
       }
       System.out.println("A empresa vai aumentar sua folha de pagamento em "+totalAumentoFolha);
    }
}
