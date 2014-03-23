package cap3;

public abstract class TemplateImpostoCondicional implements Imposto {

	@Override
	public double calcula(Orcamento orcamento) {
		// TODO Auto-generated method stub
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		} else {
			return minimaTaxacao(orcamento);
		}
	}

	public abstract double minimaTaxacao(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
