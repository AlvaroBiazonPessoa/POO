package composição;

public class SistemaInterno {
	private final int SENHA = 12345;
	public void autenticaSistemaInterno(Autenticavel autenticavel) {
		boolean autenticou = autenticavel.autentica(this.SENHA);
		if(autenticou) {
			System.out.println("ACESSO LIBERADO");
		} else {
			System.out.println("ACESSO NEGADO");
		}
	}
}
