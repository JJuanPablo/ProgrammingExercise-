import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, x;

        System.out.println("Digite o coeficiente 'a':");
        a = in.nextDouble();

        System.out.println("Digite o coeficiente 'b':");
        b = in.nextDouble();

        if (a != 0) {

            x = -b / a;
            System.out.println("A solução da equação é: " + x);
        } else {
            if (b == 0) {
                System.out.println("A equação é uma identidade verdadeira, ou seja, todos os valores de x são soluções.");
            } else {
                System.out.println("A equação não tem solução real.");
            }
        }
    }
}
