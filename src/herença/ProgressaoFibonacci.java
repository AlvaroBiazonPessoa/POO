package herença;

public class ProgressaoFibonacci extends Progressao {
	protected long valorAnterior;
	public ProgressaoFibonacci() {
		this(0, 1);
	}
	public ProgressaoFibonacci(long valor1, long valor2) {
		primeiroValor = valor1;
		valorAnterior = valor2-valor1;
	}
	@Override
	protected long proximoValor() {
		long auxiliar = valorAnterior;
		valorAnterior = valorAtual;
		valorAtual += auxiliar;
		return valorAtual;
	}
}
