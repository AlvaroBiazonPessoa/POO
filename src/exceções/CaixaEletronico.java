package exceções;

import java.util.Scanner;

public class CaixaEletronico {
	Scanner scanner = new Scanner(System.in);
	public ContaBancaria menuCadastro() {
		System.out.println("=-=-=-=-=-=MENU CADASTRO=-=-=-=-=-=");
		System.out.print(">>Digite o nome do correntista: ");
		String correntista = scanner.nextLine();
        System.out.print(">>Digite o saldo: ");
        double saldo = scanner.nextDouble();
        ContaBancaria contaBancaria = new ContaBancaria(correntista, saldo);
        return contaBancaria;
	}
	public int menuPrincipal() {
		System.out.println("=-=-=-=-=-=MENU PRINCIPAL=-=-=-=-=-=");
        System.out.println("(1) Status Conta");
        System.out.println("(2) Sacar");
        System.out.println("(3) Depositar");
        System.out.println("(0) Sair");
        System.out.print(">>Digite sua opção: ");
        int opcao = scanner.nextInt();
        return opcao;   
	}
	public double menuSaque() {
		System.out.println("=-=-=-=-=-=MENU SAQUE=-=-=-=-=-=");
		System.out.print(">>Valor saque: ");
		double valorSaque = scanner.nextDouble();
		return valorSaque;
	}
	public double menuDeposito() {
		System.out.println("=-=-=-=-=-=MENU DEPOSITO=-=-=-=-=-=");
		System.out.print(">>Valor deposito: ");
		double valorDeposito = scanner.nextDouble();
		return valorDeposito;
	}
}
