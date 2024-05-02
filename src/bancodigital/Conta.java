package bancodigital;

public abstract class Conta implements AccountOperations {
	
	protected static final int AGENCIA_PADRAO = 1;
	protected static int SEQUENCIAL = 0;
	
	protected int agencia;
	protected int conta;
	protected double saldo;
	
	
	public Conta(double saldo) {
		this.agencia = AGENCIA_PADRAO;
		this.conta = ++SEQUENCIAL;
		this.saldo = saldo;
	}
	

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
            if(valor <= this.saldo){
                saldo -= valor;
                System.out.println("\t*** O valor de R$" + valor 
                		+ " foi debitado.");
             } else {
                System.out.println("\t*** O valor de R$" + valor 
                		+ " não foi debitado.\n");
             }
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
            saldo += valor;
            System.out.println("\t*** O valor de R$" + valor 
            		+ " foi creditado.");
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
                System.out.println("\n\tRealizando Transferência...");
		this.sacar(valor);
        contaDestino.depositar(valor);
	}

	@Override
	public String toString() {
		return "\t[agencia=" + agencia + ", conta=" + conta + ", saldo=" + saldo;
	}

	
	
}
