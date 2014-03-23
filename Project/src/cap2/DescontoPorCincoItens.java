package cap2;

public class DescontoPorCincoItens implements Desconto {

	private Desconto proximo;

	@Override
	public double desconta(Orcamento orcamento) {
		// TODO Auto-generated method stub
		if (orcamento.getItens().size() > 5) {
		
		return orcamento.getValor() * 0.01;
		}else 
			return proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		// TODO Auto-generated method stub
		this.proximo = proximo;
	}

}
