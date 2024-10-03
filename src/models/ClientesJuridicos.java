package models;
/*
 * @author Taynara
 */

public class ClientesJuridicos extends ClientesGeral {
	//Declarando atributos
	private String cnpj;
	
	//Construtor da classe
	public ClientesJuridicos(String nome, String endereco, String email, String cnpj) {
		super(nome, endereco, email);
		this.cnpj = cnpj;
		
	}
	
	//@return o CNPJ
	public String getCNPJ() {
		return
			cnpj;
	}
	
}
