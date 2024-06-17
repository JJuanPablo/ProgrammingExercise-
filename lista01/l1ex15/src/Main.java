import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double raio, altura, volume;
        final double PI = 3.14159;

        System.out.println("Digite o raio do cilindro:");
        raio = in.nextDouble();

        System.out.println("Digite a altura do cilindro:");
        altura = in.nextDouble();

        volume = PI * raio * raio * altura;

        System.out.println("O volume do cilindro é: " + volume);
    }
}
