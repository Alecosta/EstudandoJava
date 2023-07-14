package br.pro.alecosta.exercicio08poo;

/**
 *
 * @author alecosta
 */
public class Exercicio08POO {

    public static void main(String[] args) {
        /*Escreva uma classe Data cuja instância (objeto) represente uma data. 
        Esta classe deverá dispor dos seguintes métodos:
          a. Construtor: define a data que determinado objeto (através de parâmetro),  
            este método verifica se a data está correta,  
            caso não esteja a data é configurada como 01/01/0 001
          b. Compara: recebe como parâmetro um outro objeto da Classe data,  
            compare com a data corrente e  
          retorne: 
          i. 0 se as datas forem iguais`; 
          ii. 1 se a data corrente for maior que a do parâmetro; 
          iii. -1 se a data do parâmetro for maior que a corrente.
          c. GetDia: retorna o dia da data
          d. GetMes: retorna o mês da data
          e. GetMesExtenso: retorna o mês da data corrente por extenso
          f. GetAno: retorna o ano da data
          g. IsBissexto: retorna verdadeiro se o ano da data corrente for bissexto e falso caso contrário
          h. Clone: o objeto clona a si próprio, para isto,  
             ele cria um novo objeto da classe Data com os mesmos valores de atributos e  
             retorna sua referência pelo método*/ 
        Data minhaData = new Data(29,02,2023);
        System.out.println("Data Invalida "+minhaData.getDia()+"/"+
                minhaData.getMes()+"/"+
                minhaData.getAno());
        Data minhaData2 = new Data(29,02,2024);
        System.out.println("Data valida "+minhaData2.getDia()+"/"+
                minhaData2.getMes()+"/"+
                minhaData2.getAno());
        
        String mes =  minhaData2.getMesExtenso();
        System.out.println(mes);
        
        Data minhaDataClonada = minhaData2.Clone();
        System.out.println("Data clonada  "+minhaDataClonada.getDia()+"/"+
                minhaDataClonada.getMes()+"/"+
                minhaDataClonada.getAno());
        
    }
}
