package main;

import herença.*;

public class Main {
	public static void main(String[] args) {
		Progressao progressao;
		System.out.println("Progressão Aritimética com razão padrão:");
		progressao = new ProgressaoAritmetica();
		progressao.printProgressao(10);
		System.out.println("Progressão Aritimética com razão 5:");
		progressao = new ProgressaoAritmetica(5);
		progressao.printProgressao(10);
	}

}
