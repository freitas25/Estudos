package cap2.conta_bancaria;

import java.util.Random;

public class Arrojado implements Imvestimento {

	private Random random;
	
	public Arrojado()
	{
		this.random = new Random();
	}
	
	@Override
	public double calcula(Conta conta) {
		// TODO Auto-generated method stub
		int chute = random.nextInt(10);
		
		if (chute >= 0 && chute <=1) 
			return conta.getValor() * 0.5;
		else if (chute >= 2 && chute <= 4) return conta.getValor() * 0.3;
		else
			return conta.getValor() * 0.006;
	}

}
