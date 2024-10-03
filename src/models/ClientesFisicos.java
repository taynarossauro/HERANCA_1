package models;
/*
 * @author Taynara
 */

public class ClientesFisicos extends ClientesGeral {
	//Declarando atributos
	private String CPF;
	
	//Construtor da classe
	public ClientesFisicos(String nome, String endereco, String email, String CPF) {
		super(nome, endereco, email);
		this.CPF = CPF;	
	}
	
	//@return o CPF
	public String getCPF() {
		return
			CPF;
	}
	
	
}
