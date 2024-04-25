package bancodigital;

public abstract class Conta implements AccountOperations {
	
	protected static final int AGENCIA_PADRAO = 1;
	protected static int SEQUENCIAL = 0;
	
	protected int agencia;
	protected int conta;
	protected double saldo;
	
	public Conta() {
		super();
		this.agencia = AGENCIA_PADRAO;
		this.conta = ++SEQUENCIAL;
		this.saldo = 0.0;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getNumero() {
		return conta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
            if(valor <= this.getSaldo()){
                saldo -= valor;
                System.out.println("\t*** O valor de R$" + valor + " foi debitado.");
             } else {
                System.out.println("\t*** O valor de R$" + valor + " não foi debitado.");
             }
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
            saldo += valor;
            System.out.println("\t*** Deposito de R$" + valor + " realizado!");
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
                System.out.println("\tRealizando Transferência...");
		this.sacar(valor);
                contaDestino.depositar(valor);
	}

	@Override
	public String toString() {
		return "[agencia=" + agencia + ", conta=" + conta + ", saldo=" + saldo + "]";
	}

	
	
}
