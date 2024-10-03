package models;
/*
 * @author Taynara
 */

public class Funcionarios extends PessoasGeral{
	//Declarando atributos
	private double salario;
	private String cpf;
	
	//Construtor da classe
	public Funcionarios (String nome, String endereco, int salario, String cpf) {
		super(nome, endereco);
		this.salario = salario;
		this.cpf = cpf;
	}
	
	//@return o CPF
	public String getCPF() {
		return
			cpf;
	}
	
	//@return salario
	public double getSalario() {
		return
			salario;
	}
}
