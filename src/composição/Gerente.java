package composição;

public class Gerente extends Funcionario implements Autenticavel {
	private AutenticavelUtil autenticador;
	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
		this.bonificacao = 0.25;
		this.autenticador = new AutenticavelUtil();
	}
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenhaUtil(senha);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autenticaUtil(senha);
	}

	@Override
	public double getBonificacao() {
		return this.bonificacao*this.salario;
	}
}
