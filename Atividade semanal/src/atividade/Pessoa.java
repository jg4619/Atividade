package atividade;

public class Pessoa {
   
	public static String nome;

	public String getNome() {
		return Pessoa.nome;
	}

	public void setNome(String nome) {
		Pessoa.nome = nome;
	}
	
	public static void oi(){
		System.out.println(nome + "[pessoa]: E ae,blz? ");
	}
   
	public void amigo(){
		Funcionario.oi();
	}
}
