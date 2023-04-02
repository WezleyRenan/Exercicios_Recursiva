package Exercicio4;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int n = 0, maximo;
	    
		Contagem conta = new Contagem();
		Scanner input = new Scanner (System.in);
		System.out.println("digite um numero:");
		maximo = input.nextInt();

		System.out.println(conta.cont(n,maximo));

	}

}
