import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean jogarNovamente = true;

        while (jogarNovamente) {
            boolean jogadorPerdeu = false;

            for (int numero = 1; numero <= 10; numero++) {
                System.out.println("Tabuada do " + numero + ":");

                for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
                    int resultadoEsperado = numero * multiplicador;
                    System.out.print(numero + " x " + multiplicador + " = ");

                    int resultadoJogador = scanner.nextInt();

                    if (resultadoJogador != resultadoEsperado) {
                        System.out.println("Você errou! O resultado correto era: " + resultadoEsperado);
                        jogadorPerdeu = true;
                        break; // Encerra o loop interno
                    }
                }

                if (jogadorPerdeu) {
                    System.out.println("Você perdeu! Tente novamente.");
                    break;
                }

                System.out.println();
            }

            if (!jogadorPerdeu) {
                System.out.println("Parabéns! Você completou todas as tabuadas sem erros.");
            }

            System.out.print("Deseja jogar novamente? (s/n): ");
            char escolha = scanner.next().charAt(0);
            jogarNovamente = (escolha == 's' || escolha == 'S');
        }
    }
}
