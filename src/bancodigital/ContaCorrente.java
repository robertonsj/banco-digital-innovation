package bancodigital;

public class ContaCorrente extends Conta{


	public ContaCorrente(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		StringBuilder info = new StringBuilder(super.toString() + ", tipo=corrente]");
		return info.toString();
	}

}
