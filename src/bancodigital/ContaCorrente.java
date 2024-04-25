package bancodigital;

public class ContaCorrente extends Conta{

	
	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("\nConta Corrente {\n");
		info.append(super.toString()).append("\n}");
		return info.toString();
	}

}
