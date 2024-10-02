package models;

public class ClientesFisicos extends ClientesGeral {
	//Declarando atributos
	private String CPF;
	
	public ClientesFisicos(String nome, String endereco, String email, String CPF) {
		super(nome, endereco, email);
		this.CPF = CPF;
		
	}
	
	public String getCPF() {
		return
				CPF;
	}
	
	
}
