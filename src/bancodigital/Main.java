package bancodigital;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco banco = new Banco();
		banco.contas.add(new ContaPoupanca("Roberto"));
		banco.contas.add(new ContaCorrente("Rayane"));
		banco.contas.add(new ContaCorrente("J. Augusto"));
		banco.contas.add(new ContaCorrente("M. do Carmo"));
		
        System.out.println("Iniciando operações do banco " + banco +"...");       
                banco.contas.get(0).sacar(100);
                banco.contas.get(0).depositar(200);
                
                for(Conta conta : banco.contas) {
        			System.out.println(conta);
        		}
                
                banco.contas.get(0).transferir(50, banco.contas.get(1));
                System.out.println(banco.contas.get(0));
                System.out.println(banco.contas.get(1));
	}

}
