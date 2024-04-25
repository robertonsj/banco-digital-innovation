package bancodigital;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco banco = new Banco();
		banco.lista.add(new ContaPoupanca());
		banco.lista.add(new ContaCorrente());
		banco.lista.add(new ContaCorrente());
		banco.lista.add(new ContaCorrente());
		
		for(Conta conta : banco.lista) {
			System.out.println(conta.toString());
		}
                
                banco.lista.get(0).sacar(100);
                banco.lista.get(0).depositar(200);
                System.out.println(banco.lista.get(0).toString());
                
                banco.lista.get(0).transferir(50, banco.lista.get(1));
                System.out.println(banco.lista.get(0).toString());
                System.out.println(banco.lista.get(1).toString());
	}

}
