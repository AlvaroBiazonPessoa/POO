//DialogoPessoas usa uma implementação da interface GerenciadorPessoas
package interfaces;

import java.util.List;
import java.util.Scanner;

public class DialogoPessoas {
	private Scanner scanner = new Scanner(System.in);
	private GerenciadorPessoas gerenciador;
	public DialogoPessoas(GerenciadorPessoas gerenciador) {
		this.gerenciador = gerenciador;
	}
	public void dialogar() {
		boolean sair = false;
		String opcao;
		while(!sair) {
			System.out.println("=-=MENU PRINCIPA=-=");
			System.out.println("(1) Listar pessoas");
			System.out.println("(2) Adicionar pessoa");
			System.out.println("(3) Sair");
			System.out.println(">>Digite a opção: ");
			opcao = scanner.nextLine();
			switch(opcao) {
			case "1" :
				listarPessoas();
				break;
			case "2" :
				adicionarNovaPessoa();
				break;
			case "3" :
				sair = true;
				break;
			default :
				System.out.println("Opção inválida!");
			}
		}
		System.out.println("Fim do programa!");
	}
	private void listarPessoas() {
		List<Pessoa> pessoas = gerenciador.obterPessoa();
		System.out.println("=-=LISTA DE PESSOAS=-=");
		for(Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
	}
	private void adicionarNovaPessoa() {
		System.out.print(">>Digite o nome: ");
		String novoNome = scanner.nextLine();
		System.out.print(">>Digite o CPF: ");
		String novoCpf = scanner.nextLine();
		System.out.print(">>Digite a idade: ");
		int novaIdade = scanner.nextInt();
		Pessoa novaPessoa = new Pessoa(novoNome, novoCpf, novaIdade);
		gerenciador.adicionarPessoa(novaPessoa);
	}
}
