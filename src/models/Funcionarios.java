package models;

public class Funcionarios extends PessoasGeral{
	private double salario;
	private String cpf;
	
	//Construtor da classe
	public Funcionarios (String nome, String endereco, int salario, String cpf) {
		super(nome, endereco);
		this.salario = salario;
		this.cpf = cpf;
	}
	
	public String getCPF() {
		return
			cpf;
	}
	
	public double getSalario() {
		return
			salario;
	}
}
