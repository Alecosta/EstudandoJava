package br.pro.alecosta.exercicio03;

/**
 *
 * @author alecosta
 */
public class Exercicio03 {

    public static void main(String[] args) {
        /*Crie uma classe para representar uma BombaCombustivel. 
          A classe BombaCombustivel deve conter os seguintes atributos: 
          tipo de combustível, 
          valor por litro e 
          quantidade de combustível. 
         Além desses atributos a classes deve conter os seguintes métodos.
          a. abastecerPorValor;  
             // método onde é informad o o valor a ser abastecido e  
             mostra a quantidade de litros que foi colocada no veículo
          b. abastecerPorLitro;  
             // método onde é informa do a quantidade em litros de combustível e  
                mostra o valor a ser pago pelo cliente.
          c. alterarValor;  
             // altera o valor do  litro do combustível.
          d. alterarCombustivel;  
             // altera o tipo do combustível.
          e. alterarQuantidadeCombustivel;  
             // altera a quantidade de combustível restante na bomba.
        Crie uma classe que contenha um método main para testar sua classe BombaCombustível*/
        
        BombaCombustivel minhaBomba = new BombaCombustivel();
        minhaBomba.alterarQuantidadeCombustivel(500);
        minhaBomba.alterarValor(4.85f);
        System.out.println("A Bomba esta com "+minhaBomba.getQuantCombustivel()+" litros");
        System.out.println("Abastecendo 50 litros");
        minhaBomba.abastecerPorLitro(50);
        System.out.println("Ajustando quantidade e litros na bomba");
        
        minhaBomba.setQuantCombustivel(minhaBomba.getQuantCombustivel()-50);
        System.out.println("A Bomba esta com "+minhaBomba.getQuantCombustivel()+" litros");
        
        System.out.println("Abastecendo o valor 100,00");
        minhaBomba.abastecerPorValor(100);
        
        
        
    }
}
