import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double milimetros, polegadas;

        System.out.println("Digite a medida em milímetros:");
        milimetros = in.nextDouble();

        polegadas = milimetros / 25.4;

        milimetros = milimetros % 25.4;

        System.out.println("A medida em polegadas é: " + polegadas);
        System.out.println("A medida em milimetros é: " + milimetros);

    }
}