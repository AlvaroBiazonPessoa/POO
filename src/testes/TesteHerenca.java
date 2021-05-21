package testes;

import heren�a.*;

public class TesteHerenca {
	public static void main(String[] args) {
		Progressao progressao;
		
		//Testa ProgressaoAritimetica
		System.out.println("Progress�o Aritim�tica com raz�o padr�o:");
		progressao = new ProgressaoAritmetica();
		progressao.printProgressao(10);
		System.out.println("Progress�o Aritim�tica com raz�o 5:");
		progressao = new ProgressaoAritmetica(5);
		progressao.printProgressao(10);
		
		//Testa ProgressaoGeometrica
		System.out.println("Progressa�o Geom�trica com raz�o padr�o:");
		progressao = new ProgressaoGeometrica();
		progressao.printProgressao(10);
		System.out.println("Progress�o Geom�trica com raz�o 3");
		progressao = new ProgressaoGeometrica(3);
		progressao.printProgressao(10);
		
		//Testa ProgressaoFibonacci
		System.out.println("Progress�o Fibonacci com valores default: ");
		progressao = new ProgressaoFibonacci();
		progressao.printProgressao(10);
		System.out.println("Progres�o Fibonacci com valores 4 e 6:  ");
		progressao = new ProgressaoFibonacci(4, 6);
		progressao.printProgressao(10);
	}

}
