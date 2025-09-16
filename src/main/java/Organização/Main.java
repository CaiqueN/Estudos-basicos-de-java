package Organização;

import Organização.Switch01.Valor;
import Organização.coordenadas02.Coordenadas;
import Organização.matrizes.Matriz;
import Organização.matrizes.MatrizDois;
import Organização.matrizes.QuadradoMistico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + "Teste:");

        Scanner Scanner = new Scanner(System.in);

        System.out.println("01 -Testar o programa switch");
        System.out.println("02 - Testar o programa coordenadas");
        System.out.println("03 - Testar o programa matriz"  );
        System.out.println("04 - testar o programa matriz dois");

        System.out.println("\n"+ "Escolha uma opção :");

        int option;

        option = Scanner.nextInt();

        switch (option) {
            case 1 -> Valor.valor(Scanner);
            case 2 -> Coordenadas.coordenadas(Scanner);
            case 3 -> Matriz.matriz(Scanner);
            case 4 -> MatrizDois.maxDois(Scanner);
            case 5 -> QuadradoMistico.mistico(Scanner);
            default -> System.out.println("Opcão invalida");

        }

        Scanner.close();
    }
}

