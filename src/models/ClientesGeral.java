package models;
/*
 * @author Taynara
 */

public class ClientesGeral extends PessoasGeral {
	//Declarando variáveis
	private String email;
	
	//Construtor da classe
	public ClientesGeral (String nome, String endereco, String email) {
		super(nome, endereco);
		this.email = email;
		
	}
	
	//@return construtor de E-mail
	public String getEmail() {
		return
				email;
	}
}
