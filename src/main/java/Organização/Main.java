package Organização;

import Organização.Switch01.Valor;
import Organização.coordenadas02.Coordenadas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + "Teste:");

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Escolha uma opção\n :");
        System.out.println("01 -Testar o programa switch");
        System.out.println("02 - Testar o programa coordenadas");


        int option;

        option = Scanner.nextInt();

        switch (option) {
            case 1 -> Valor.valor(Scanner);
            case 2 -> Coordenadas.coordenadas(Scanner);

        }

        Scanner.close();
    }
}

