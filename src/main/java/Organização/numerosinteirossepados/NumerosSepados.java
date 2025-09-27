package Organização.numerosinteirossepados;

import java.util.Scanner;

public class NumerosSepados {
    public static void separar(Scanner scanner){

        System.out.println("Digite um numero limite");
        int numeroLimite = scanner.nextInt();

        for(int i = 2; i <= numeroLimite; i++ ){
            if(i % 2 == 0){
                System.out.println(i + "");

            }

        }

        for (int j = 1; j <= numeroLimite ; j++) {
            if(j % 2 != 0){
                System.out.println( j +"");

            }
        }
    }
}
