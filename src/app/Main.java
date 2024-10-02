package app;
import models.*;

public class Main {
	
	public static void main (String args[]) { 
	//Criando uma pessoa
	PessoasGeral pessoa_1 = new PessoasGeral("Taynara Raquel","Rua Nair Nogueira Jordão");
	
	//Criando um cliente físico
	ClientesFisicos cliente_fisico_1 = new ClientesFisicos("Gustavo Pereira","Rua André Nogueira Jordão", "gustavopereira@gmail.com", "566.989.089-09");
	
	//Criando um cliente jurídico
	ClientesJuridicos cliente_juridico_1 = new ClientesJuridicos("Joao Raquel", "Rua Nair Raquel Jordão", "joaoraquel@gmail.com", "12.3412.3412.0001");
	
	//Criando um funcionário
	Funcionarios funcionario_1 = new Funcionarios("Sarah Jennifer","Rua Andre Sentelhas Jordão", 1414, "566.787.980-04");
	
	//Printando os objetos criados
	System.out.print("Dados de uma pessoa:" + "\nNome: " + pessoa_1.getNome() + "\nEndereço: " + pessoa_1.getEndereco() + "\n\n");
	System.out.print("Dados de um cliente físico:" + "\nNome: " + cliente_fisico_1.getNome() + "\nEndereço: " + cliente_fisico_1.getEndereco()+ 
	"\nCPF: "+ cliente_fisico_1.getCPF() + "\n\n");
	System.out.print("Dados de um cliente jurídico:" + "\nNome: " + cliente_juridico_1.getNome() + "\nEndereço: " + cliente_juridico_1.getEndereco() 
	+  "\nEmail: " + cliente_juridico_1.getEmail() + "\nCNPJ: " + cliente_juridico_1.getCNPJ() + "\n\n");
	System.out.print("Dados de um funcionário:" + "\nNome: " + funcionario_1.getNome() + "\nEndereço: " + funcionario_1.getEndereco() 
	+ "\nCPF: " + funcionario_1.getCPF() + "\n\n");
	
	
	}
}
