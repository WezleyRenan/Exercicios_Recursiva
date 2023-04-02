package Exercicio5;

public class Potenciacao {

	public int potencia(int n, int p) {
		
		if (p < 1 && p > 0) {
			return n * potencia(n,p - 1);
		}
		if (p == 0) {
			return 1;
		}
		return n;

		
	}

}
