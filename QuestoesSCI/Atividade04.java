package Atividades;

import java.util.Scanner;
import java.util.Vector;

public class Atividade04 {

	public static void main(String[] args) {
		// 4- Criar um vetor de cinco posições, solicitar cinco números e ao fim,
		// imprimir o valor apresentado na posição três.

		
	int vetor[] = new int[5];
	Scanner sc = new Scanner(System.in);
	
	for (int i = 0; i < vetor.length; i++) {
		System.out.println("Digite um número: ");
		vetor[i] = sc.nextInt();
	}
	System.out.println("O valor apresentado na posição três é: " + vetor[3]);
	}

}