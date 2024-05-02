package bancodigital;

public class ContaPoupanca extends Conta {

	
	public ContaPoupanca(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder(super.toString() + ", tipo=poupanca]");
		return info.toString();
	}
	
}
