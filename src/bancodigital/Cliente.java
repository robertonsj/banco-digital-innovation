package bancodigital;

public class Cliente {
	private String nome;
	private String email;
	
	public Cliente(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
	
}
