package models;
/*
 * @author Taynara
 * 
 * Essa é a superclasse que representa "pessoa", os elementos que a compoem são utilizados
 * nas subclasses inseridas em models.
 */


public class PessoasGeral {
	//Declarando variáveis
	private String nome;
	private String endereco;
	
	//Construtor da classe
	public PessoasGeral (String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}
	
	//@return Construtor de nome
	public String getNome() {
		return
			nome;
	}
	
	//@return construtor de endereço
	public String getEndereco() {
		return
			endereco;
	}
	
}
