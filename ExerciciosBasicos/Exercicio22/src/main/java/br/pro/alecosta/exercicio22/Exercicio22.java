package br.pro.alecosta.exercicio22;

import java.util.Scanner;

/**
 *
 * @author alecosta
 */
public class Exercicio22 {

    public static void main(String[] args) {
        //receba o preço de custo e o preço de venda de 40 produtos. 
        //Mostre como resultado se houve lucro, prejuízo ou empate para cada produto. 
        //Informe o valor de custo de cada produto, 
        //o valor de venda de cada produto, 
        //a média de preço de custo 
        //e do preço de venda;
        
        double mediaPrecoVenda = 0d;
        double mediaPrecoCusto = 0d;
        double valorVenda;
        double valorCusto;
        String resultado;
        double precoCusto;
        double precoVenda;
        
        Scanner ler = new Scanner(System.in);

        for (int i=1; i<=40 ; i++) {
            
            System.out.println("Informe o preço de custo do produto "+i);
            precoCusto = ler.nextDouble();
            System.out.println("Informe o preço de venda do produto "+i);
            precoVenda = ler.nextDouble();
            
            if (precoCusto > precoVenda) {
                System.out.println("Houve Prejuzo");
            } else {
                if (precoCusto < precoVenda) {
                    System.out.println("Houve Lucro");
                } else {
                    System.out.println("Houve empate"); 
                }
            }
            System.out.println("O valor de custo do produto "+i+" é "+precoCusto);
            System.out.println("O valor de venda do produto "+i+" é "+precoVenda);
            mediaPrecoCusto = mediaPrecoCusto + precoCusto;
            mediaPrecoVenda = mediaPrecoVenda + precoVenda;
        }      
        
        mediaPrecoCusto = mediaPrecoCusto/40;
        mediaPrecoVenda = mediaPrecoVenda/40;
        
        System.out.println("a media do preço de custo é "+mediaPrecoCusto);
        System.out.println("a media do preço de venda é "+mediaPrecoVenda);
    }
}
