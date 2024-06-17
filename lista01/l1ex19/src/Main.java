import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;

        System.out.println("Digite o coeficiente 'a':");
        a = in.nextDouble();

        System.out.println("Digite o coeficiente 'b':");
        b = in.nextDouble();

        System.out.println("Digite o coeficiente 'c':");
        c = in.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {

            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("As soluções da equação são: x1 = " + x1 + " e x2 = " + x2);
        } else if (discriminante == 0) {

            double x = -b / (2 * a);
            System.out.println("A solução da equação é: x = " + x);
        } else {

            System.out.println("A equação não possui solução real.");
        }
    }
}
