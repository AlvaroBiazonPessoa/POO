package testes;

import composi��o.*;

public class TesteComposicao {
	public static void main(String[] args) {
		Gerente gerente = new Gerente("�lvaro", "398.900.518-00", 3000);
		gerente.setSenha(12345);
		
		Cliente cliente = new Cliente("Regina", "regina@gmail.com");
		cliente.setSenha(54321);
		
		SistemaInterno sistemaInterno = new SistemaInterno();
		sistemaInterno.autenticaSistemaInterno(gerente);
		sistemaInterno.autenticaSistemaInterno(cliente);
	}
}
