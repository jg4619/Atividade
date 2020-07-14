package atividade;

import atividade.Funcionario;

public class Comunicação {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("João");
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

