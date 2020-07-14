package atividade;

public class Funcionario extends Pessoa{
	
	public static String nome;

    public static void ola(){
    	System.out.println(nome + "[funcionario] : Bom Dia");
    }
     
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		Funcionario.nome = nome;
	}
      
    
 }
  
 