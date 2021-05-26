package exceções;

public class SaldoInsuficienteException extends Exception {
	private double excedente;
	public SaldoInsuficienteException(String mensagem, double excedente) {
		super(mensagem);
		this.excedente = excedente;
	}
	public double getExcedente() {
		return excedente;
	}
}
