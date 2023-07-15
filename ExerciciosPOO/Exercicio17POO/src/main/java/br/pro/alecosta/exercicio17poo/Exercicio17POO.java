package br.pro.alecosta.exercicio17poo;

/**
 *
 * @author alecosta
 */
public class Exercicio17POO {

    public static void main(String[] args) {
        /*O agendamento de compromissos é uma das tarefas mais comuns para profissionais. 
          Um sistema com essa finalidade deve ser capaz de gerenciar 
          compromissos, atribuindo a cada um o seu tipo 
           (reunião, pagamento, entrega de projeto); 
          data; 
          nome do participante ( pessoa, empresa etc) alguém com quem acontecerá é o compromisso) e seu 
          telefone. 
          Desenvolva um sistema que seja capaz de fazer operações básicas como 
          agendar, 
          remover e 
          alterar compromissos e 
          exibir compromissos 
          por participante e 
          por data.*/
        
        Agenda minhaagenda = new Agenda();
        minhaagenda.Agendar("reunião", "15/07/2023", "Tony Stark", "555-1234");
        minhaagenda.Agendar("reunião", "15/07/2023", "Steve Rogers", "555-4321");
 
        minhaagenda.ExibirPorData("15/07/2023");
        
        
        minhaagenda.Remover(1);
        
        minhaagenda.ExibirPorData("15/07/2023");
 //       minhaagenda.ExibirPorParticipante("Steve Rogers");
 
        minhaagenda.Alterar(0, "reunião", "15/07/2023", "Steve Rogers", "555-1234");
 
        minhaagenda.ExibirPorData("15/07/2023");
 
    }
}
