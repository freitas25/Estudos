package cap2.conta_bancaria;

import java.util.Random;

public class Moderado implements Imvestimento {

	private Random random;

	@Override
	public double calcula(Conta conta) {
		// TODO Auto-generated method stub

		if (random.nextInt(2) == 0)
			return conta.getValor() * 0.025;
		else
			return conta.getValor() * 0.007;
	}
}
