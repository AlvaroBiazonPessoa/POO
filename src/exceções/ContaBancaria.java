package exceções;

public class ContaBancaria {
	private String correntista;
	private double saldo;
	private static double VALOR_MAXIMO_DEPOSITO = 5000;
	public ContaBancaria(String correntista, double saldo) {
		this.correntista = correntista;
		this.saldo = saldo;
	}
	public void depositar(double valorDeposito) {
		if(valorDeposito > VALOR_MAXIMO_DEPOSITO) {
			throw new DepositoMaximoException("Valor máximo de depósito é de R$" + VALOR_MAXIMO_DEPOSITO);
		}
		this.saldo += valorDeposito;
	}
	public void sacar(double valorSaque) throws SaldoInsuficienteException {
		if(this.saldo < valorSaque) {
			throw new SaldoInsuficienteException("Saque excedeu R$", valorSaque- this.saldo);
		}
		this.saldo -= valorSaque;
	}
	@Override
	public String toString() {
		return "ContaBancaria [correntista= " + correntista + ", saldo= R$" + saldo + "]";
	}
	
}
