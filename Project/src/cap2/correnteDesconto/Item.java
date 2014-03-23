package cap2.correnteDesconto;

public class Item {

	
	private  String nome;
	private  double valor;

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	public Item(String nome,double valor){
		this.nome = nome;
		this.valor = valor;
		
	}
}
