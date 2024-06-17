import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2, num3;

        System.out.println("Digite o primeiro número inteiro:");
        num1 = in.nextInt();

        System.out.println("Digite o segundo número inteiro:");
        num2 = in.nextInt();

        System.out.println("Digite o terceiro número inteiro:");
        num3 = in.nextInt();


        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Os números em ordem crescente são:");
        System.out.println(num1 + ", " + num2 + ", " + num3);
    }
}