package Organização.matrizes;

import java.util.Scanner;

public class QuadradoMistico {

    public static void mistico(Scanner scanner) {

        System.out.print("Digite o tamanho da matriz: ");
        int n = scanner.nextInt();

        int[][] e = new int[n][n];

        System.out.println("Digite os valores da matriz:");
        for (int l = 0; l < n; l++) {
            for (int c = 0; c < n; c++) {
                e[l][c] = scanner.nextInt();
            }
        }

        int somaRef = 0;
        for (int c = 0; c < n; c++) {
            somaRef += e[0][c];
        }

        boolean qm = true;

        for (int l = 1; l < n && qm; l++) {
            int somaLinha = 0;
            for (int c = 0; c < n; c++) {
                somaLinha += e[l][c];
            }
            if (somaLinha != somaRef) {
                qm = false;
            }
        }

        for (int c = 0; c < n && qm; c++) {
            int somaColuna = 0;
            for (int l = 0; l < n; l++) {
                somaColuna += e[l][c];
            }
            if (somaColuna != somaRef) {
                qm = false;
            }
        }

        int somaDiag1 = 0, somaDiag2 = 0;
        for (int i = 0; i < n; i++) {
            somaDiag1 += e[i][i];
            somaDiag2 += e[i][n - 1 - i];
        }
        if (somaDiag1 != somaRef || somaDiag2 != somaRef) {
            qm = false;
        }

        if (qm) {
            System.out.println("É um quadrado místico!");
        } else {
            System.out.println("Não é um quadrado místico.");
        }
    }
}

