package Organização.maiornumero;

import java.util.Scanner;

public class MaiorNumero {
    public static void number (Scanner scanner){
        System.out.println("Digite um numkero: ");
        int numero;
        int maior = Integer.MIN_VALUE;

        System.out.println("Digite um numero (0 para sair) ");
        numero = scanner.nextInt();

        while (numero != 0){
            if (numero > maior) {
                maior = numero;
            }

            numero = scanner.nextInt();
        }if (maior == Integer.MIN_VALUE){
            System.out.println("Nenhum numero digitado");
        }else {
            System.out.println("O numero digitado foi: " + maior);
        }
    }
}
