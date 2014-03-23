package cap2.correnteDesconto;

public class CalculadorDeDesconto {

	public double calcula(Orcamento orcamento) {

		DescontoPorCincoItens d2 = new DescontoPorCincoItens();
		DescontoPorMaisDeQuinhentosReais d1 = new DescontoPorMaisDeQuinhentosReais();
		DescontoPorVendaCasada d3 = new DescontoPorVendaCasada();
		SemDesconto d4 = new SemDesconto();
		
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		d3.setProximo(d4);

		return d1.desconta(orcamento);
	}

}
