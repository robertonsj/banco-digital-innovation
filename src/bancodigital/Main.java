package bancodigital;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		List<User> users = new ArrayList<>();
		
		users.add(new User("Roberto", new ContaCorrente(2000)));
		users.get(0).setCredentials("roberto111", "123");
		
		users.add(new User("Rayane", new ContaCorrente(2000))); 
		users.get(1).setCredentials("rayane444", "456");
		
		users.add(new User("Jose", new ContaPoupanca(500))); 
		users.get(2).setCredentials("jose777", "789");
		
		
		
        try {
        	System.out.println("\n====== SESSÃO DE AUTENTICAÇÃO =======");
			UserAuthentication.authenticateUser(reader, users);
			
			
			System.out.println("\n====== BEM VINDO AO BANCO RB =======");
			users.forEach(user -> System.out.println(user));
			
			//User1 transfers R$500 to user2
			System.out.print("\nTransferir R$500 de " + users.get(0).getName() + 
					" para " + users.get(1).getName());
			users.get(0).getConta().transferir(500, users.get(1).getConta());
			users.forEach(user -> System.out.println(user));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
	
	
	

}
