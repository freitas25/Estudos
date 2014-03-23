package cap2;

public class DescontoPorMaisDeQuinhentosReais implements Desconto {
	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		// TODO Auto-generated method stub
		if (orcamento.getValor()>500)
		{
			return orcamento.getValor()*0.07;
		}
		else
			return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		// TODO Auto-generated method stub
		this.proximo = proximo;
	}

	
}
