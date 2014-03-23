package cap2.conta_bancaria;


public class Conta {

	private double valor =200;
	
	public Conta (double valor){
		this.valor = valor;
		
	}

	public double getValor() {
		return valor;
	}

	public void deposita(double valor) {
		this.valor += valor;
	}
	
	
}
