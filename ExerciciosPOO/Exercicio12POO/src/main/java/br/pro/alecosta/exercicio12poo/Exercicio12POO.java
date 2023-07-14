package br.pro.alecosta.exercicio12poo;

/**
 *
 * @author alecosta
 */
public class Exercicio12POO {

    public static void main(String[] args) {
        /*Crie uma classe Agenda que pode armazenar 10 pessoas e que 
        seja capaz de realizar as seguintes operações:
         a. void armazenarPessoa(String nome, int idade, float altura); //armazena a pessoa em um array
         b. void removerPessoa(String nome); //remove a pessoa do array
         c. int buscarPessoa(String nome); // informa em que posição da agenda está a pessoa
         d. void imprimirAgenda(); // imprime os dados de todas as pessoas da agenda
         e. void imprimirPessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda.*/
         Agenda minhaAgenda = new Agenda();
         minhaAgenda.armazenarPessoa("Ale", 18, 188);
         minhaAgenda.armazenarPessoa("Celia", 19, 158);
         minhaAgenda.imprimirAgenda();
         minhaAgenda.removerPessoa("Celia");
         minhaAgenda.imprimirAgenda();
         minhaAgenda.removerPessoa("Ale");
         minhaAgenda.imprimirAgenda();
    
    }
}
