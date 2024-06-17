import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, n2, media;

        System.out.println("Digite a primeira nota (N1):");
        n1 = in.nextDouble();

        System.out.println("Digite a segunda nota (N2):");
        n2 = in.nextDouble();

        media = (n1 * 1 + n2 * 2) / (1 + 2);

        if (media < 0) {
            media = 0;
        } else if (media > 10) {
            media = 10;
        }

        System.out.println("A média é: " + media);
    }
}
