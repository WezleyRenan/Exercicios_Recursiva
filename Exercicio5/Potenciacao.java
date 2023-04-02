package Exercicio5;

public class Potenciacao {

	public int potencia(int n, int p) throws Exception {

		if (p > 0) {
			return n * potencia(n, p - 1);
		}
		if (p < 0) {
			throw new Exception("expoente negativo erro!!!");
		}
		return 1;
	}
}
