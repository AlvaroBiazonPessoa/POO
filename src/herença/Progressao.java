package herença;

public class Progressao {
	protected long primeiroValor;
	protected long valorAtual;
	protected long razao;
	public Progressao() {
		valorAtual = primeiroValor = 0;
	}
	protected long primeiroValor() {
		valorAtual = primeiroValor;
		return valorAtual;
	}
	protected long proximoValor() {
		return ++valorAtual;
	}
	public void printProgressao(int n) {
		System.out.print(primeiroValor());
		for(int i = 2; i <= n; i++) {
			System.out.print(" " + proximoValor());
		}
		System.out.println();
	}
}
