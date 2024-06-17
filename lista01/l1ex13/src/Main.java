import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double raio, area;
        final double PI = 3.14159;

        System.out.println("Digite o raio do círculo:");
        raio = in.nextDouble();

        area = PI * raio * raio;

        System.out.println("A área do círculo é: " + area);
    }
}
