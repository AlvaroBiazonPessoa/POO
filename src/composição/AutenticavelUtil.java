package composição;

public class AutenticavelUtil {
	private int senha;
	public void setSenhaUtil(int senha) {
		this.senha = senha;
	}
	public boolean autenticaUtil(int senha) {
		return this.senha == senha ? true : false;
	}
}
