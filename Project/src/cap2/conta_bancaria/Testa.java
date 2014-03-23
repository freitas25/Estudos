package cap2.conta_bancaria;

public class Testa {

	public static void main(String[] args) {

		Imvestimento conservador = new Conservador();
		Imvestimento moderado = new Moderado();
		Imvestimento arrojado = new Arrojado();

		
		Conta conta = new Conta(500);
		
		RealizadorDeImvestimentos r = new RealizadorDeImvestimentos();
		
		r.realiza(conta, conservador);

		System.out.println(conta.getValor());
	}
}
