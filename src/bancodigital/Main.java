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
	}

}
