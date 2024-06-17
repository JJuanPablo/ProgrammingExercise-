import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double raio, altura, volume;
        final double PI = 3.14159;

        System.out.println("Digite o raio do cone:");
        raio = in.nextDouble();

        System.out.println("Digite a altura do cone:");
        altura = in.nextDouble();

        volume = (1.0/3.0) * PI * raio * raio * altura;

        System.out.println("O volume do cone é: " + volume);
    }
}
