package cap2;

public interface Desconto {

	double desconta(Orcamento orcamento);
	void setProximo(Desconto desconto);
}
