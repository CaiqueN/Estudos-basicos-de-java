package Organização.numberimpares;

import java.util.Scanner;

public class NumerosImpares {
    public static void numberImpar(Scanner scanner){

        System.out.println("Numeros impares de 0 a 100");

        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0){

                System.out.println(i + "");
            }

        }
    }
}
