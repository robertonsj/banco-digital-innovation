package bancodigital;

public abstract class Conta implements AccountOperations {
	
	protected static final int AGENCIA_PADRAO = 1;
	protected static int SEQUENCIAL = 0;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	public Conta() {
		super();
		this.agencia = AGENCIA_PADRAO;
		this.numero = ++SEQUENCIAL;
		this.saldo = 0.0;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	
	

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "[agencia=" + agencia + ", numero=" + numero + ", saldo=" + saldo + "]";
	}

	
	
}
