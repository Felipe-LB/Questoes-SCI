package Atividades;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] notas = new double[3][4];
        String[] nomes = new String[3];
        double maiorMedia = 0;
        double menorMedia = Double.MAX_VALUE;
        String nomeMaiorMedia = "";
        String nomeMenorMedia = "";

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            nomes[i] = input.nextLine();
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a nota " + (j + 1) + " do aluno " + nomes[i] + ": ");
                notas[i][j] = input.nextDouble();
            }
        }

        for (int i = 0; i < 3; i++) {
            double soma = 0;
            for (int j = 0; j < 4; j++) {
                soma += notas[i][j];
            }
            double media = soma / 4.0;
            System.out.println("Aluno: " + nomes[i] + " Média: " + media);
            if (media > maiorMedia) {
                maiorMedia = media;
                nomeMaiorMedia = nomes[i];
            }
            if (media < menorMedia) {
                menorMedia = media;
                nomeMenorMedia = nomes[i];
            }
        }

        System.out.println("Aluno com maior média: " + nomeMaiorMedia);
        System.out.println("Aluno com menor média: " + nomeMenorMedia);
    }
}
