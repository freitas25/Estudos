package cap2.correnteDesconto;

public class DescontoPorVendaCasada implements Desconto {

	private Desconto proximo;

	public boolean existe(String nomeDoItem, Orcamento orcamento) {
		// TODO Auto-generated method stub
		for (Item item : orcamento.getItens()) {
			if (item.getNome().equals(nomeDoItem))
				return true;
		}
		return false;
	}

	@Override
	public void setProximo(Desconto proximo) {
		// TODO Auto-generated method stub
		this.proximo = proximo;
	}

	@Override
	public double desconta(Orcamento orcamento) {
		// TODO Auto-generated method stub
		if (existe("LAPIS", orcamento) && existe("CANETA", orcamento))
			return orcamento.getValor()*0.05;
			else
			return proximo.desconta(orcamento);
	}

}
