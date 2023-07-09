package br.pro.alecosta.exercicio01poo;

import java.text.ParseException;

/**
 *
 * @author alecosta
 */
public class Exercicio01POO {

    public static void main(String[] args) throws ParseException {
        /*Crie uma classe para representar uma Pessoa 
        com os atributos privados de nome, data de nascimento e altura. 
        Crie os métodos públicos necessários para getters e setters e 
        também um método para imprimir todos dados de uma pessoa. 
        Crie um método para calcular a idade da pessoa.*/
    
    
    Pessoa pessoa = new Pessoa();
    
    pessoa.setNome("Ale");
    pessoa.setDataNascimento("19/01/1971");
    pessoa.setAltura(188);
    
    pessoa.calculaIdade();
    
    pessoa.imprimir();
               
    }        
    
}
