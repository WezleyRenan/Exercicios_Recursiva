package Exercicio6;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws Exception {
		double n;
	    
		Fatorial conta = new Fatorial();
		Scanner input = new Scanner (System.in);
		System.out.println("digite um numero que voce deseja operar:");
		n = input.nextDouble();

		try{System.out.println(conta.fator(n));
		} catch (Exception erro) {
			System.out.println(erro.getMessage());
		}
	}

}
