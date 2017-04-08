
import java.sql.Timestamp;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author RafaelaEmília
 */
public class Visitante {
  private long id;
  private String nome;
  private int idade;
  private Date entrada;
  private Date saida;
  
public Visitante(){

}

    public Visitante(long id, String nome, int idade, Date entrada, Date saida) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.entrada = entrada;
        this.saida = saida;
    }

   
    public long getId() {
        return id;
    }

  
    public void setId(long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public int getIdade() {
        return idade;
    }

   
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    public Date getEntrada() {
        return entrada;
    }

    
    public void setEntrada(Date entrada) {
        this.entrada = entrada;
    }

    
    public Date getSaida() {
        return saida;
    }

   
    public void setSaida(Date saida) {
        this.saida = saida;
    }
  
}
