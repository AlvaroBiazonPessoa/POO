package exceções;

public class DepositoMaximoException extends RuntimeException {
	public DepositoMaximoException(String mensagem) {
		super(mensagem);
	}
}
