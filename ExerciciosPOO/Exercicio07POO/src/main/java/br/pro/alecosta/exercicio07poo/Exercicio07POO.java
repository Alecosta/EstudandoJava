package br.pro.alecosta.exercicio07poo;

/**
 *
 * @author alecosta
 */
public class Exercicio07POO {

    public static void main(String[] args) {
        /*A fim de representar funcionários em uma empresa, 
          crie uma classe chamada Funcionario que inclui as três informações a seguir como atributos:
            a. um primeiro nome,
            b. um sobrenome
            c. um salário mensal
            ok Sua classe deve ter um construtor que inicializa os três atributos. 
        ok Forneça os métodos getters e setters para cada atributo. 
        ok Se o salário mensal não for positivo, configure-o como 0.0. 
        ok Escreva um aplicativo de teste que demonstra as capacidades da classe. 
        ok Crie duas instâncias da classe e exiba o salário anual de cada instância. 
        ok Então dê a cada empregado um aumento de 10% e 
        ok exiba novamente o salário anual de cada empregado.*/
        
      Funcionario funcionario1 = new Funcionario("Alexandre", "Costa", 1000);
      Funcionario funcionario2 = new Funcionario("Celia", "Costa", 1110);
 
      float salarioAnual;
      
      salarioAnual = funcionario1.getSalarioMensal() * 12;
      System.out.println("o salario anual do funcionario"
      +funcionario1.getPrimeiroNome() +" é "+ salarioAnual);
      
      salarioAnual = funcionario2.getSalarioMensal() * 12;
      System.out.println("o salario anual do funcionario"
      +funcionario2.getPrimeiroNome() +" é "+ salarioAnual);
      
      System.out.println("passando cada empregado um aumento de 10%");
      
      funcionario1.setSalarioMensal(funcionario1.getSalarioMensal()*1.1f);
      funcionario2.setSalarioMensal(funcionario2.getSalarioMensal()*1.1f);
      
      salarioAnual = funcionario1.getSalarioMensal() * 12;
      System.out.println("o novo salario anual do funcionario"
      +funcionario1.getPrimeiroNome() +" é "+ salarioAnual);
      
      salarioAnual = funcionario2.getSalarioMensal() * 12;
      System.out.println("o novo salario anual do funcionario"
      +funcionario2.getPrimeiroNome() +" é "+ salarioAnual);
      
    }
}
