package composição;

public class Cliente implements Autenticavel {
	private String nome;
	private String email;
	private AutenticavelUtil autenticador;
	public Cliente(String nome, String email) {
		this.nome = nome;
		this.email = email;
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
}
