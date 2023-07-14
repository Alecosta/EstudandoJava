package br.pro.alecosta.exercicio12poo;

/**
 *
 * @author alecosta
 */
public class Agenda {
    
    private Pessoa[] pessoa = new Pessoa[10] ;

    public Agenda() {
        
         for (int i = 0; i < 10;i++) {
             this.pessoa[i] = new Pessoa("",0,0);

         }       
         
    }
    
    public void armazenarPessoa(String nome, int idade, int altura) {
        
        int indice = buscarPessoa("");
        if (indice >= 0) {
           this.pessoa[indice].setNome(nome);
           this.pessoa[indice].setIdade(idade);
           this.pessoa[indice].setAltura(altura);            
        }
       
    }
    
    public void removerPessoa(String nome) {
       
        int indice = buscarPessoa(nome);
        if (indice >= 0) {
          this.pessoa[indice].setNome("");
          this.pessoa[indice].setIdade(0);
          this.pessoa[indice].setAltura(0);  
        }
    }
        
     
    public int buscarPessoa(String nome) {
        
        for (int i = 0; i < 10; i++) {
            if (this.pessoa[i].getNome() == nome) {
                return(i);
            }
        }
        return -1;
    } 
    
    public void imprimirAgenda() {
         System.out.println(String.format( "%-20s %-6s %-6s ","","","").replace(' ','-'));
         System.out.println(String.format( "%-20s %-6s %-6s ","Nome","Idade","Altura"));
         System.out.println(String.format( "%-20s %-6s %-6s ","","","").replace(' ','-'));
         for (int i = 0; i < 10; i++) {
            if (this.pessoa[i].getNome() != "") {
                imprimirPessoa(i);
            }
        }       
         System.out.println(String.format( "%-20s %-6s %-6s ","","","").replace(' ','-'));
         System.out.println("");
    }
    
    public void imprimirPessoa(int index) {
     //   System.out.println(
     //      this.pessoa[index].getNome()+";"+
     //      this.pessoa[index].getIdade()+";"+
     //      this.pessoa[index].getAltura());
        System.out.println(String.format( "%-20s %-6s %-6s ",
                this.pessoa[index].getNome(),
                this.pessoa[index].getIdade(),
                this.pessoa[index].getAltura()));
        
    }
    
}
