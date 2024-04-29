package bancodigital;

public class ContaCorrente extends Conta{

	
	public ContaCorrente(String nome) {
		// TODO Auto-generated constructor stub
		super.cliente = new Cliente(nome);
	}

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("Conta Corrente {\n");
		info.append(super.toString()).append("\n}");
		return info.toString();
	}

}
