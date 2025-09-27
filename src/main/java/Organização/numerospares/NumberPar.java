package Organização.numerospares;

import java.util.Scanner;

public class NumberPar {
    public static void par(Scanner scanner){
        System.out.println("Numeros pares de 2 a 100");

        for (int i = 0; i < 100; i++){
            if (i % 2 == 0) {
                System.out.println(i +"");
            }
        }
    }
}
