import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double nota1, nota2;

        System.out.println("Digite a nota 1:");
        nota1 = in.nextDouble();

        System.out.println("Digite a nota 2:");
        nota2 = in.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Média: " + media);

        if (media >= 50) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Digite a nota da prova de recuperação:");
            double notaRecuperacao = in.nextDouble();

            double novaMedia = (media + notaRecuperacao) / 2;

            if (novaMedia < 50) {
                System.out.println("Reprovado");
            } else {
                System.out.println("Aprovado");
            }
        }
    }
}
