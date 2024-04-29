package bancodigital;

public class ContaPoupanca extends Conta {

	
	public ContaPoupanca(Cliente cliente) {
		// TODO Auto-generated constructor stub
		this.cliente = cliente;
	}


	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("Conta Poupança {\n");
		info.append(super.toString()).append("\n}");
		return info.toString();
	}
	
}
