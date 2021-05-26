package testes;

import exceções.CaixaEletronico;
import exceções.ContaBancaria;
import exceções.DepositoMaximoException;
import exceções.SaldoInsuficienteException;

public class TesteExcecoes {
	public static void main(String[] args) {
		CaixaEletronico caixaEletronico = new CaixaEletronico();
		ContaBancaria contaBancaria = caixaEletronico.menuCadastro();
		boolean sair = false;
		while(!sair) {
			int opcao = caixaEletronico.menuPrincipal();
        	if(opcao == 1) {
        		System.out.println(contaBancaria.toString());
        	} else if (opcao == 2) {
        		double valorSaque = caixaEletronico.menuSaque();
				try {
					contaBancaria.sacar(valorSaque);
					System.out.println("Saque realizado com sucesso!");
				} catch (SaldoInsuficienteException ex) {
					System.out.println(ex.getMessage() + ex.getExcedente());
				}
        	} else if(opcao == 3) {
        		try {
        			double valorDeposito = caixaEletronico.menuDeposito();
        			contaBancaria.depositar(valorDeposito);
        			System.out.println("Deposito realizado com sucesso!");
        		} catch(DepositoMaximoException ex) {
        			System.out.println(ex.getMessage());
        		}
			} else if(opcao == 0) {
				System.out.println("=-=-=-=-=-=FIM=-=-=-=-=-=");
        		sair = true;
        	}
        }
	}
}
