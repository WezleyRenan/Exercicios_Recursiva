package Exercicio3;

public class Contagem {

	public String cont(int n) {

		if (n < 10) {
			if (n % 2 == 0) {
				System.out.println(n + " é par");
			}
			if (n % 2 == 1) {
				System.out.println(n + " é impar");
			}
			return cont(n + 1);

		} else {
			if (n % 2 == 0) {
				return n + " é par";
			}
			return n + " é impar";
		}
	}
}
