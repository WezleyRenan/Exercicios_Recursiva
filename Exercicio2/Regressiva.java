package Exercicio2;

public class Regressiva {
	
	public int retro(int n) {
		
		if (n > 0) {
			System.out.println(n);
			return retro(n - 1);
		}
		return n;
	}

}
