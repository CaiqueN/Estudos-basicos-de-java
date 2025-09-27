package Organização.numeroimpares;

import java.util.Scanner;

public class Soma {
    public static void soma (Scanner scanner){

        int soma = 1;
        int total = 1;


        while (soma <= 100) {
            if (soma % 2 == 0) {
                soma += total;

            }

            soma++;
        }

        System.out.println("Somatorio de numeros pares de 0 a 100 " + total);
    }
}
