package bancodigital;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

public class UserAuthentication {
	
//	static Map<String, String> userCredentials = new HashMap<>();
//	//static Map<String, Usuario> usuarios = new HashMap<>();
	
	
	static boolean isValidInput(String input) {
		return input != null && !input.trim().isEmpty();
	}
	
	static void authenticateUser(BufferedReader reader, List<User> users) throws IOException {
		
		while(true) {
			
				System.out.print("Enter username: ");
				String username = reader.readLine();
				
				System.out.print("Enter password: ");
				String password = reader.readLine();
				
				if(isValidInput(username) && isValidInput(password)) {
					for(User user : users) {
						if(user.getUsername().equals(username) && 
								user.getPassword().equals(password)) {
							System.out.println("\n\t*** Authentication successful!\n");
							return;
						}
					}
					System.err.println("\t*** Invalid username or password. Please try again");
				} else {
					System.err.println("\t*** Username and password cannot be empty. Please try again.");
				}
			
		}
	}
}
