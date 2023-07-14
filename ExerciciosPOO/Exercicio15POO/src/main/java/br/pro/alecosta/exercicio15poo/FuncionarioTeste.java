package br.pro.alecosta.exercicio15poo;

/**
 *
 * @author alecosta
 */
public class FuncionarioTeste {

    public static void main(String[] args) {
        /*Crie uma classe chamada Funcionário que inclui três atributos:
          a. nome (String);
          b. sobrenome (String);
          c. salário mensal (double). 
          A classe deve ter um construtor,  
          métodos getters e setters para cada  atributo da classe. 
          Escreva uma classe chamada 
          
          FuncionarioTeste (que contenha o método main) que cria 
          dois objetos da classe Funcionario e 
          exibe o salário de cada objeto. 
           Então dê a cada Funcionario um aumento de 10% e exiba novamente 
           o salário anual de cada um deles. 
           Introduza na classe Funcionario uma variável de classe capaz de 
          contabilizar o numero de funcionarios que passaram pela empresa até a data.*/
        
          Funcionario funcionario1 = new Funcionario("Tony", "Stark", 10000000);
          System.out.println("Funcionarios ja contratados "+ funcionario1.getTotalDeFuncionariosJaContratados());
          Funcionario funcionario2 = new Funcionario("Steve", "Rogers", 50000);
          System.out.println("Funcionarios ja contratados "+ funcionario2.getTotalDeFuncionariosJaContratados());
          
          System.out.println("Salario Funcionario 1 "+ funcionario1.getSalarioMensal());
          System.out.println("Salario Funcionario 2 "+ funcionario2.getSalarioMensal());
          
          funcionario1.setSalarioMensal(funcionario1.getSalarioMensal()*1.1d);
          funcionario2.setSalarioMensal(funcionario2.getSalarioMensal()*1.1d);
          
          System.out.println("Salario Funcionario 1 "+ funcionario1.getSalarioMensal());
          System.out.println("Salario Funcionario 2 "+ funcionario2.getSalarioMensal());
          
          
    }
}
