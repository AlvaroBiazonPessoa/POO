package composição;

public abstract class Funcionario {
	private String nome;
	private String cpf;
	protected double salario;
	protected double bonificacao;
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}
	public double getSalario() {
		return this.salario;
	}
	public abstract double getBonificacao(); 
}
