package Organização;

import Organização.Switch01.Valor;
import Organização.coordenadas02.Coordenadas;
import Organização.enunciado.MediaNumeros;
import Organização.maiornumero.MaiorNumero;
import Organização.matrizes.Matriz;
import Organização.matrizes.MatrizDois;
import Organização.matrizes.QuadradoMistico;
import Organização.numberimpares.NumerosImpares;
import Organização.numeroimpares.Soma;
import Organização.numerosinteirossepados.NumerosSepados;
import Organização.numerospares.NumberPar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + "Teste:");

        Scanner Scanner = new Scanner(System.in);

        System.out.println("01 -Testar o programa switch");
        System.out.println("02 - Testar o programa coordenadas");
        System.out.println("03 - Testar o programa matriz"  );
        System.out.println("04 - testar o programa matriz dois");
        System.out.println("05 - testar o programa quadrado mistico");
        System.out.println("06 - testar o programa soma ");
        System.out.println("07 - testar o programa maior numero");
        System.out.println("08 - testar o programa media de numeros");
        System.out.println("09 - testar o prpgrama numeros impares");
        System.out.println("10 - testar o programa number par");
        System.out.println("11 - testar o programa numero separados");

        System.out.println("\n"+ "Escolha uma opção :");

        int option;

        option = Scanner.nextInt();

        switch (option) {
            case 1 -> Valor.valor(Scanner);
            case 2 -> Coordenadas.coordenadas(Scanner);
            case 3 -> Matriz.matriz(Scanner);
            case 4 -> MatrizDois.maxDois(Scanner);
            case 5 -> QuadradoMistico.mistico(Scanner);
            case 6 -> Soma.soma(Scanner);
            case 7 -> MaiorNumero.number(Scanner);
            case 8 -> MediaNumeros.calcular(Scanner);
            case 9 -> NumerosImpares.numberImpar(Scanner);
            case 10 -> NumberPar.par(Scanner);
            case 11 -> NumerosSepados.separar(Scanner);
            default -> System.out.println("Opcão invalida");

        }

        Scanner.close();
    }
}

