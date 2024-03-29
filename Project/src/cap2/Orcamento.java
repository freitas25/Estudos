package cap2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {

	private  double valor;
	private  List<Item> itens;
	
	public Orcamento(double valor){
		this.valor = valor;
		itens = new ArrayList<Item>();
	
	}

	public double getValor() {
		return valor;
	}

	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public void adicionaIten(Item item){
		itens.add(item);
	}
}
