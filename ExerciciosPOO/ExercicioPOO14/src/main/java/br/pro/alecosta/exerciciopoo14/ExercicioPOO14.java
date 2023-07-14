package br.pro.alecosta.exerciciopoo14;

/**
 *
 * @author alecosta
 */
public class ExercicioPOO14 {

    public static void main(String[] args) {
        /*Crie uma classe em Java chamada 
        Fatura para uma loja de suprimentos de informática. 
        A classe deve conter quatro atributos: 
         a. número (String);
         b. descrição (String);
         c. quantidade comprada de um item (int);
         d. preço por item (double).
         A classe deve ter um construtor e os métodos getters e setters.  
         Além disso, forneça um método chamado  
         getTotalFatura que calcula o valor da fatura e depois retorna o valor como um double.  
          Se o valor não for positivo, ele deve ser alterado para 0.  
          Se o preço por item não for positivo, ele deve ser alterado para 0. 
    
        Escreva uma nova classe chamada  
         FaturaTeste (que contenha o métod o main) que demonstre as capacidades da classe Fatura.*/
       
        
        
        Fatura minhaFatura = new Fatura("555", "CPU", 1, 999.99f);
        
        double totalFatura = minhaFatura.getTotalFatura();
        System.out.println("Total da Fatura "+ totalFatura );
        
        minhaFatura.setPreco(-900);
        totalFatura = minhaFatura.getTotalFatura();
        
        
        System.out.println("Total da Fatura "+ totalFatura );
        
        
   
        
        
    }
}