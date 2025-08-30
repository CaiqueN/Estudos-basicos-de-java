package Organização.Switch01;

import java.util.Scanner;

public class Valor {

    public static void valor (Scanner Scanner){

        int valor;
        System.out.println("Digite uma opção por gentileza");
        valor = Scanner.nextInt();


        switch (valor) {
            case 1:
                System.out.println("Digite o valor 1");
                break;
            case 2:
                System.out.println("Digite o valor 2");
                break;

            case 3:
                System.out.println("Digite o valor 3");
                break;

            default:
                System.out.print("Opção invalida");
        }

    }
}
