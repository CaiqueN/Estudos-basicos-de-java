package Organização.matrizes;

import java.util.Scanner;

public class MatrizDois {
    public static void maxDois ( Scanner scanner ) {

        float matriz [] [] = new float[12][12];
        int L;
        char T;

        System.out.print("Digite o número da linha: ");
        L = scanner.nextInt();

        System.out.print("Digite o tipo: ");
        scanner.nextLine();
        T = scanner.nextLine().charAt(0);

        for(int l = 0; l < 12; l++ ){
            for (int c = 0; c < 12; c++){
                matriz[l][c] = scanner.nextFloat();
            }
        }

        float res =0;
        for (int c = 0; c < 12 ; c++) {
            res += matriz [L][c];
        }
        if (T =='S'){
            System.out.printf("%.1f", res);
        }else {
            System.out.printf("%.1f",res /12);
        }
    }
}
