package Exercicio6;

public class Fatorial {

	public double fator(double n) throws Exception {
		if (n > 0) {
			return n * fator(n - 1);
		}
		if (n < 0) {
			throw new Exception ("erro numero invalido");
		}
		return 1;
		
		


	}
}
