package interfaces;

public class Pessoa {
	private String nome;
	private String cpf;
	private int idade;
	public Pessoa(String nome, String cpf, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	@Override
	public String toString() {
		return "[NOME=" + nome + ", CPF=" + cpf + ", IDADE=" + idade + "]";
	}
	
	
}
