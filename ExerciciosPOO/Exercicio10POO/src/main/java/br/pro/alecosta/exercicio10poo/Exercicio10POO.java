package br.pro.alecosta.exercicio10poo;

/**
 *
 * @author alecosta
 */
public class Exercicio10POO {

    public static void main(String[] args) {
       /*Crie uma classe para representar um jogador de futebol, com os atributos:
         a. nome;
         b. posição;
         c. data de nascimento;
         d. nacionalidade;
         e. altura;
         f. peso;
         Crie os métodos públicos necessários para getters e setters e 
          também um método para imprimir todos os dados do jogador. 
          Crie um método para calcular a idade do jogador e 
          outro método para mostrar quanto tempo falta para o jogador se aposentar. 
          Para isso, considere que 
             os jogadores da posição de defesa se aposentam em média aos 40 anos, 
             os jogadores de meio-campo aos 38 e 
             os atacantes aos 35.*/
       
       Jogador meuJogador = new Jogador("Pele", "atacante", new Data(01,01,2000), "Brasileiro", 180, 80);
       meuJogador.imprimirDados();
       
    }
}
