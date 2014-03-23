package cap2.correnteDesconto;

public class TesteCorrente {

	public static void main(String[] args) {
	

		CalculadorDeDesconto calculador = new CalculadorDeDesconto();
		
		Orcamento orcamento = new Orcamento(500.0);
		
		orcamento.adicionaIten(new Item("LAPIS",250));
		orcamento.adicionaIten(new Item("CANETA",250));
		
		double desconto = calculador.calcula(orcamento);
		
		System.out.println(desconto);
		
	}

}
