package models;

public class ClientesJuridicos extends ClientesGeral {
	//Declarando atributos
	private String cnpj;
	
	public ClientesJuridicos(String nome, String endereco, String email, String cnpj) {
		super(nome, endereco, email);
		this.cnpj = cnpj;
		
	}
	
	public String getCNPJ() {
		return
				cnpj;
	}
	
	
}
