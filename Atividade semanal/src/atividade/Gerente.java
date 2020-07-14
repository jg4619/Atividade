package atividade;

public class Gerente extends Funcionario {
   
	public String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
    
	public void ei(){
		System.out.println(nome + "[gerente]: Cadê o relatório?!");
		
	}
    
	public void confus(){
		Gerente.oi();	
	    Gerente.ola();
	}
}
