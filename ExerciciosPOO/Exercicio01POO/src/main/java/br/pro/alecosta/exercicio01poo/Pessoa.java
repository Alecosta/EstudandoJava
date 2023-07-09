package br.pro.alecosta.exercicio01poo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

/**
 *
 * @author alecosta
 */
public class Pessoa {
    
    private String nome;
    private String strDataNascimento;
    private Date dataNascimento;
    private int altura;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return strDataNascimento;
    }

    public void setDataNascimento(String dataNascimento) throws ParseException {
        this.strDataNascimento = dataNascimento;
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        this.dataNascimento = formatoData.parse(this.strDataNascimento);

    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    
    public void imprimir() {
        System.out.println("Nome :"+this.nome );
        System.out.println("Altura :"+this.altura );
        System.out.println("Data de Nascimento :"+this.dataNascimento );
        System.out.println("Idade :"+this.idade );
    }

    public void calculaIdade () {
        
        LocalDate dataAtual = LocalDate.now();
        LocalDate nascimento  = this.dataNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Period periodo = Period.between(nascimento,dataAtual);
        this.idade = periodo.getYears();
        
    } 
    
    
    
}
