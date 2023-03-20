package Atividades;
import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		/*
	1 - Solicitar a inserção de 5 números, ao final, imprimir os números pares, 
	números ímpares e a média geral desses números.*/

		
		 Scanner digita = new Scanner(System.in);
	        int[] numeros = new int[5];
	        int soma = 0;
	        int countPares = 0;
	        int countImpares = 0;

	        for (int i = 0; i < numeros.length; i++) {
	            System.out.print("Digite o " + (i + 1) + "º número: ");
	            numeros[i] = digita.nextInt();
	            soma += numeros[i];
	            if (numeros[i] % 2 == 0) {
	                countPares++;
	            } else {
	                countImpares++;
	            }
	        }

	        System.out.println("Quantidade de números pares: " + countPares);
	        System.out.println("Quantidade de números ímpares: " + countImpares);

	        double media = (double) soma / numeros.length;
	        System.out.println("Média geral: " + media);
	}

}

