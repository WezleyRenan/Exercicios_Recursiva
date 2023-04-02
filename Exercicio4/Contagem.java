package Exercicio4;

public class Contagem {

	public int cont(int n, int m) {

		if (n < m) {
			System.out.println(n);
			return cont(n + 2, m);

		} else {
			if (n > m) {
				return n - 1;
			}
			return n;
		}

	}

}