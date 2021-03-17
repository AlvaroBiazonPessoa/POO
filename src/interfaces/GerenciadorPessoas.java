package interfaces;

import java.util.List;

public interface GerenciadorPessoas {
	public abstract List<Pessoa> obterPessoa();
	public abstract void adicionarPessoa(Pessoa novaPessoa);
}
