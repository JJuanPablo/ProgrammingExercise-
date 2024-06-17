import java.util.Scanner;

public class Main {
    public static boolean verificarPalindromo(String str) {

        str = str.replaceAll("\\s+", "").toLowerCase();


        int inicio = 0;
        int fim = str.length() - 1;


        while (inicio < fim) {
            if (str.charAt(inicio) != str.charAt(fim)) {
                return false;
            }
            inicio++;
            fim--;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma string para verificar se é um palíndromo: ");
        String str = scanner.nextLine();


        if (verificarPalindromo(str)) {
            System.out.println("A string \"" + str + "\" é um palíndromo.");
        } else {
            System.out.println("A string \"" + str + "\" não é um palíndromo.");
        }


    }
}
