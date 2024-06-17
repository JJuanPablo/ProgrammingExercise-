import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.println("Digite a temperatura em graus Celsius:");
        celsius = in.nextDouble();

        fahrenheit = (celsius * 9) / 5 + 32;

        System.out.println("A temperatura em graus Fahrenheit é: " + fahrenheit);
    }
}
