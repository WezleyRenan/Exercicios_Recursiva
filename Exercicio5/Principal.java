package Exercicio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n, pow;
	    
		Potenciacao conta = new Potenciacao();
		Scanner input = new Scanner (System.in);
		System.out.println("digite um numero que voce deseja operar:");
		n = input.nextInt();
		System.out.println("digite o numero do expoente");
        pow = input.nextInt();

		System.out.println(conta.potencia(n,pow));

	}

}
