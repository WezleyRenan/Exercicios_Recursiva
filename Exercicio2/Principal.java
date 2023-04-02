package Exercicio2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n;
		Regressiva regres = new Regressiva();
		
		Scanner input = new Scanner(System.in);
		System.out.println("digite um numero");
		n = input.nextInt();
		
		System.out.println(regres.retro(n));
		

	}

}
