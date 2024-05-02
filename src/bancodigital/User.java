package bancodigital;

public class User {
	private String name;
	private Conta conta;
	
	//Credentials
	private String username;
	private String password;
	
	public User(String name, Conta conta) {
		this.name = name;
		this.conta = conta;
	}
	
	public void setCredentials(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getUsername() {
		return this.username;
	}
	public String getPassword() {
		return this.password;
	}
	
	public Conta getConta() {
		return this.conta;
	}
	
	public String getName() {
		return this.name;
	}
	

	@Override
	public String toString() {
		StringBuilder info = new StringBuilder("\nNAME: " + this.name.toUpperCase() + "\n");
		info.append(conta);
		return info.toString();
	}
	
}
