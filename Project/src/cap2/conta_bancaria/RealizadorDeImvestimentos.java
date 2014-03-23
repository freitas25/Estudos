package cap2.conta_bancaria;

public class RealizadorDeImvestimentos {

	public void realiza(Conta conta,Imvestimento imposto){
		
		double resultado = imposto.calcula(conta);
		
		conta.deposita(resultado*0.75);
		System.out.println(" novo saldo "+ conta.getValor());
	};
}
