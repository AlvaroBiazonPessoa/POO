package testes;

import interfaces.DialogoPessoas;
import interfaces.GerenciadorPessoas;
import interfaces.GerenciadorPessoasImpl;

public class TesteInterface {
	public static void main(String[] args) {
		GerenciadorPessoas gerenciadorPessoas = new GerenciadorPessoasImpl();
		DialogoPessoas dialogoPessoas = new DialogoPessoas(gerenciadorPessoas);
		dialogoPessoas.dialogar();
	}
}
