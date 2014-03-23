package cap1;

public class TesteDeImpostos {

	public static void main(String[] args) {

		Imposto iss = new ISS();
		Imposto icms = new ICMS();

		Orcamento orcamento = new Orcamento(500);

		// CalculadorDeImposto calculador = new CalculadorDeImposto();

		// calculador.realizaCalculo(orcamento, iss);
		// calculador.realizaCalculo(orcamento, icms);

		System.out.println(iss.calcula(orcamento));
		System.out.println(icms.calcula(orcamento));
	}
}
