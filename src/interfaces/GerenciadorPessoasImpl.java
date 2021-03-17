//GerenciadorPessoasImpl implementa a interface GerenciadorPessoas
package interfaces;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorPessoasImpl implements GerenciadorPessoas {
	private List<Pessoa> pessoas = new ArrayList<Pessoa>();
	@Override
	public List<Pessoa> obterPessoa() {
		return pessoas;
	}

	@Override
	public void adicionarPessoa(Pessoa novaPessoa) {
		pessoas.add(novaPessoa);
	}

}
