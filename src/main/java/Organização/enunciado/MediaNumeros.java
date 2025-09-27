package Organização.enunciado;

import java.util.Scanner;

public class MediaNumeros {
    public static void calcular(Scanner scanner) {
        int soma = 0;
        int contador = 0;
        int numero;

        System.out.println("Digite números para calcular a média (0 para sair):");
        numero = scanner.nextInt();

        while (numero != 0) {
            soma += numero;
            contador++;
            numero = scanner.nextInt();
        }

        if (contador == 0) {
            System.out.println("Nenhum número foi digitado.");
        } else {
            double media = (double) soma / contador;
            System.out.println("A média dos números digitados é: " + media);
        }
    }
}
