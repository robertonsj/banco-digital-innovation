package bancodigital;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private String nome = "Banco RB";
	public List<Conta> contas;
	
	public Banco() {
		this.contas = new ArrayList();
	}
	@Override
	public String toString() {
		return this.nome;
	}
	
}
