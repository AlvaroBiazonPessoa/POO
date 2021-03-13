package testes;

import herença.*;

public class TesteHerenca {
	public static void main(String[] args) {
		Progressao progressao;
		System.out.println("Progressão Aritimética com razão padrão:");
		progressao = new ProgressaoAritmetica();
		progressao.printProgressao(10);
		System.out.println("Progressão Aritimética com razão 5:");
		progressao = new ProgressaoAritmetica(5);
		progressao.printProgressao(10);
		
		System.out.println("Progressaão Geométrica com razão padrão:");
		progressao = new ProgressaoGeometrica();
		progressao.printProgressao(10);
		System.out.println("Progressão Geométrica com razão 3");
		progressao = new ProgressaoGeometrica(3);
		progressao.printProgressao(10);
	}

}
