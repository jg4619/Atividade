package atividade;

import atividade.Funcionario;

public class Comunica��o {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Jo�o");
		Pessoa.oi();
        
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Livia");
		Funcionario.ola();
		
		Gerente gerente = new Gerente();
		gerente.setNome("Carlos");
		gerente.ei();
		
	    Funcionario.oi();
	    Gerente.oi();
	    Gerente.ola();
		
		
		
	}
		
}

