package bancodigital;

public class ContaPoupanca extends Conta {

	
	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("Conta Poupança {\n");
		info.append(super.toString()).append("\n}");
		return info.toString();
	}
	
}
