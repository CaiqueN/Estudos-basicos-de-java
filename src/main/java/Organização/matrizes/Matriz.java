package Organização.matrizes;

import java.util.Scanner;

public class Matriz {
    public static void matriz (Scanner scanner){

        String[][] matriz = new String[3][3];

        System.out.println("Digite os valores da matriz:");

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                matriz[linha][coluna] = scanner.nextLine();
            }
        }

        System.out.println("\nImprimindo a matriz!");
        for (int l = 0; l < 3; l++) {
            for (int c = 0; c < 3; c++) {
                System.out.printf("%10s", matriz[l][c]);
            }
            System.out.println();
        }

        System.out.println("");
    }
}

        /*matriz [0] [0] = scanner.nextLine();
        matriz [0] [1] = scanner.nextLine();
        matriz [0] [3] = scanner.nextLine();

        matriz [1] [0] = scanner.nextLine();
        matriz [1] [1] = scanner.nextLine();
        matriz [1] [2] = scanner.nextLine();

        matriz [2] [0] = scanner.nextLine();
        matriz [2] [1] = scanner.nextLine();
        matriz [2] [2] = scanner.nextLine();*/

