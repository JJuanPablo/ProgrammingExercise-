import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double lado1, lado2, lado3;

        System.out.println("Digite o comprimento do primeiro lado:");
        lado1 = in.nextDouble();

        System.out.println("Digite o comprimento do segundo lado:");
        lado2 = in.nextDouble();

        System.out.println("Digite o comprimento do terceiro lado:");
        lado3 = in.nextDouble();

        // Verifica se os três valores podem formar um triângulo
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("É um triângulo equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É um triângulo isósceles.");
            } else {
                System.out.println("É um triângulo escaleno.");
            }
        } else {
            System.out.println("Os valores fornecidos não podem formar um triângulo.");
        }
    }
}
