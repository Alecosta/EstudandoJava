package br.pro.alecosta.exercicio09poo;

/**
 *
 * @author alecosta
 */
public class Data {
    
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia,int mes, int ano) {
        
        int ultimoDiaDoMes[] = {30,28,30,31,30,31,30,31,30,31,30,31};
        
        if (isBissexto(ano)){
          ultimoDiaDoMes[1] = 29;
        }
        
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1 || dia > ultimoDiaDoMes[mes-1] ) {
           this.dia = 1;
           this.mes = 1;
           this.ano = 1;
        } else {
           this.dia = dia;
           this.mes = mes;
           this.ano = ano;
        }
 
    }
    
    public int compara (Data compara) {
        if (this.ano == compara.ano && 
            this.mes == compara.mes &&
            this.dia == compara.dia ) {
            return 0;
        } else {
            if (this.ano >  compara.ano ||
                this.ano == compara.ano && this.mes >  compara.mes ||
                this.ano == compara.ano && this.mes == compara.mes && this.dia > compara.dia) {
                return 1;
                } else {
                return 0;
                }
        }
    }
    
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }
    
    public String getMesExtenso () {
        String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio",
                          "Junho", "Julho", "Agosto", "Setembro","Outubro", 
                          "Novembro", "Dezembro" };
            return meses[this.mes-1];
    }

    public int getAno() {
        return ano;
    }
    
    public boolean isBissexto (int ano) {
       //Para ser bissexto, o ano deve ser:
       //Divisível por 4. Sendo assim, a divisão é exata com o resto igual a zero;
       //Não pode ser divisível por 100. Com isso, a divisão não é exata, ou seja, deixa resto diferente de zero;
       //Pode ser que seja divisível por 400. Caso seja divisível por 400, a divisão deve ser exata, deixando o resto igual a zero.  
       boolean ehBissexto = false;
       
       if (ano % 4 == 0) {
           if ( ano % 100 != 0) {
              ehBissexto = true;
           } else {
               if ( ano % 400 == 0) {
                  ehBissexto = true; 
               }
           }
       }
       
       return ehBissexto;
    }
    
    public Data Clone() {
        Data dataClone = new Data(this.dia,this.mes,this.ano);
        return dataClone;
    }    

}
    

