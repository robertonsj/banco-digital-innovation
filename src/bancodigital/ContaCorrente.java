package bancodigital;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        this.cliente = cliente;
    }

    
	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("Conta Corrente {\n");
		info.append(super.toString()).append("\n}");
		return info.toString();
	}

}
