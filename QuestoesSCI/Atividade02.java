package Atividades;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		// Solicitar 5 números, ao fim, imprimir o número maior e o número menor.
		Scanner sc = new Scanner(System.in);

		int numMaior = Integer.MIN_VALUE;
		int numMenor = Integer.MAX_VALUE;

		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número:");
			int numero = sc.nextInt();

			if (numero > numMaior) {
				numMaior = numero;
			}
			if (numero < numMenor) {
				numMenor = numero;
			}
		}

		System.out.println("O maior número é " + numMaior + " e o menor é " + numMenor);
	}

}