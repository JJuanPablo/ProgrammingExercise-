import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double polegadas, milimetros;

        System.out.println("Digite a medida em polegadas:");
        polegadas = in.nextDouble();

        milimetros = polegadas * 25.4;

        System.out.println("A medida em milímetros é: " + milimetros);
    }
}