    package Organização.coordenadas02;

    import java.util.Locale;
    import java.util.Scanner;

    public class Coordenadas {
        public static void coordenadas (Scanner Scanner) {

            try {

                Scanner.useLocale(Locale.US);
                float x, y;

                System.out.println("Digite um ponto x: ");
                x = Scanner.nextFloat();

                System.out.println("Digite o ponto de origem y: ");
                y = Scanner.nextFloat();

                if (x == 0 && y == 0) {
                    System.out.println("Origem");
                } else if (x == 0 && y != 0) {
                    System.out.println("Eixo x");
                } else if (y != 0 && x == 0) {
                    System.out.println("Eixo y");
                } else if (x > 0 && y > 0) {
                    System.out.println("Quadrante 1");
                } else if (x < 0 && y > 0) {
                    System.out.println("Quadrante 2");
                } else if (x < 0 && y < 0) {
                    System.out.println("Quadrante 3");
                } else if (x > 0 && y < 0) {
                    System.out.println("Quadrante 4");
                }

            }catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado " + e.getMessage());
            }

        }
    }

