package heren�a;

public class ProgressaoAritmetica extends Progressao {
	public ProgressaoAritmetica() {
		this(1);
	}
	public ProgressaoAritmetica(long r) {
		razao = r;
	}
	@Override
	protected long proximoValor() {
		valorAtual += razao;
		return valorAtual;
	}
}
