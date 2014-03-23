package cap3;

public class ICKV extends TemplateImpostoCondicional {

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return orcamento.getValor();
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return false;
	}

}
