package cap2.correnteDesconto;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {

	private Desconto proximo;

	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

	@Override
	public double desconta(Orcamento orcamento) {
		// TODO Auto-generated method stub
		if(orcamento.getValor()>500.0) return orcamento.getValor()*0.07;
		else
		return proximo.desconta(orcamento);
	} 
	
	
}
