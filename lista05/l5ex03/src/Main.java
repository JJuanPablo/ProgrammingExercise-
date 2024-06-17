import java.util.Scanner;

public class Main {
    public static int calcularPotencia(int X, int Y) {
        if (Y == 0) {
            return 1;
        } else if (Y == 1) {
            return X;
        } else {
            int resultado = X;
            for (int i = 1; i < Y; i++) {
                resultado *= X;
            }
            return resultado;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite um número inteiro para a base x: ");
        int X = scanner.nextInt();

        System.out.print("Digite um número inteiro para a potência y: ");
        int Y = scanner.nextInt();

        if (Y < 0) {
            System.out.println("A potência (Y) deve ser maior ou igual a zero.");
        } else {

            int resultado = calcularPotencia(X, Y);
            System.out.println("O resultado de " + X + " elevado a " + Y + " é: " + resultado);
        }


    }
}
