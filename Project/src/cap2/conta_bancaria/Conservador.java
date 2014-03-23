package cap2.conta_bancaria;

public class Conservador implements Imvestimento{

	@Override
	public double calcula(Conta conta) {
		// TODO Auto-generated method stub

		return conta.getValor()*0.008;
	}

}
