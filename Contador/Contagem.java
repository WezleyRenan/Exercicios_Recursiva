package Contador;

public class Contagem {

	public int cont(int n) {

		if (n < 5) {
			System.out.println(n);
			return cont(n + 1);

		} else {
			return n;
		}

	}

}
