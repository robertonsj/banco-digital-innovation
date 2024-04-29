package bancodigital;

public abstract class Conta implements AccountOperations {
	
	protected static final int AGENCIA_PADRAO = 1;
	protected static int SEQUENCIAL = 0;
	
	protected int agencia;
	protected int conta;
	protected double saldo;
	protected Cliente cliente;
	
	
	
	public Conta() {
		this.agencia = AGENCIA_PADRAO;
		this.conta = ++SEQUENCIAL;
		this.saldo = 0.0;
                //this.cliente = cliente;
	}
	

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
            if(valor <= this.saldo){
                saldo -= valor;
                System.out.println("\t*** O valor de R$" + valor 
                		+ " foi debitado da sua conta, " + this.cliente);
             } else {
                System.out.println("\t*** O valor de R$" + valor 
                		+ " não foi debitado da sua conta, " + this.cliente);
             }
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
            saldo += valor;
            System.out.println("\t*** O valor de R$" + valor 
            		+ " foi creditado na sua conta, " + this.cliente);
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
		return "[agencia=" + agencia + ", conta=" + conta + ", saldo=" + saldo + 
				", nome=" + cliente +"]";
	}

}
