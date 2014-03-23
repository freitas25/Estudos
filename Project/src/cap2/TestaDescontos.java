package cap2;

public class TestaDescontos {

	public static void main(String[] args) {
		
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		
		Orcamento orcamento = new Orcamento(600.0);
		
		
		orcamento.adicionaIten(new Item("CANETA", 300));
		orcamento.adicionaIten(new Item("LAPIS", 250));
		
		double desconto = calculador.calcula(orcamento);
		
		System.out.println(desconto);
	}
	
}
