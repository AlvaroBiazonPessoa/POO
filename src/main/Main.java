package main;

import heren�a.*;

public class Main {
	public static void main(String[] args) {
		Progressao progressao;
		System.out.println("Progress�o Aritim�tica com raz�o padr�o:");
		progressao = new ProgressaoAritmetica();
		progressao.printProgressao(10);
		System.out.println("Progress�o Aritim�tica com raz�o 5:");
		progressao = new ProgressaoAritmetica(5);
		progressao.printProgressao(10);
	}

}
