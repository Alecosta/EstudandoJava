package br.pro.alecosta.exercicio05poo;

/**
 *
 * @author alecosta
 */
public class Exercicio05POO {

    public static void main(String[] args) {
        /*Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. 
          Cada objeto dessa classe deve guardar os seguintes dados do aluno: 
           matrícula, nome, 2 notas de prova e 1 nota de trabalho. 
           Escreva os seguintes métodos para esta classe:
           a. media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2)
           media = 2.5 * prova1 + 2.5 * prova2 + 2.0 * trabalho
           b. final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final)
           prova2 = (media - 2.5 * prova1 - 2.0 * trabalho) / 2.5 */
        
           Disciplina disciplina1 = new Disciplina();
           disciplina1.setMatricula("Matematica");
           disciplina1.setNome("Celia");
           disciplina1.setMediaParaPassar(6);
           disciplina1.setProva1(5);
           disciplina1.setTrabalho(10);
           
           System.out.println("para passar o aluno precisa tirar na prova final (segunda prova) "+
                   disciplina1.provaFinal());
           
           
           disciplina1.setProva2(5);
           
           System.out.println("a média final do aluno é "+disciplina1.calculamedia());
           
    }
}
