package bancodigital;

public class ContaPoupanca extends Conta {

	
	public ContaPoupanca(String nome) {
		// TODO Auto-generated constructor stub
		super.cliente = new Cliente(nome);
	}


	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("Conta Poupança {\n");
		info.append(super.toString()).append("\n}");
		return info.toString();
	}
	
}
