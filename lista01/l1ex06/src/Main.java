import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double number, result, result1;
        Scanner in = new Scanner(System.in);
        System.out.println("Digite um número:");
        result = in.nextInt();
        result1 = (result * 3.6);
        System.out.println(" O resultado do número digitado é: " + result1);
    }
}