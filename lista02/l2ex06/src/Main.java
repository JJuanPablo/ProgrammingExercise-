import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao;

        System.out.println("Escolha uma opção entre 5 e 9:");
        opcao = in.nextInt();

        if (opcao >= 5 && opcao <= 9) {
            System.out.println("Opção escolhida: " + opcao);
        } else {
            System.out.println("Opção inválida! Por favor, escolha um número entre 5 e 9.");
        }
    }
}
