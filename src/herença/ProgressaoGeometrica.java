package herença;

public class ProgressaoGeometrica extends Progressao {
	public ProgressaoGeometrica() {
		this(2);
	}
	public ProgressaoGeometrica(long r) {
		razao = r;
		primeiroValor = 1;
		valorAtual = primeiroValor;
	}
	@Override
	protected long proximoValor() {
		valorAtual *= razao;
		return valorAtual;
	}
}
