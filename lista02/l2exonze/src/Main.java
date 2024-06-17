import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número inteiro representando o dia da semana:");
        int numeroDia = in.nextInt();

        String diaDaSemana;

        switch (numeroDia) {
            case 1:
                diaDaSemana = "domingo";
                break;
            case 2:
                diaDaSemana = "segunda-feira";
                break;
            case 3:
                diaDaSemana = "terça-feira";
                break;
            case 4:
                diaDaSemana = "quarta-feira";
                break;
            case 5:
                diaDaSemana = "quinta-feira";
                break;
            case 6:
                diaDaSemana = "sexta-feira";
                break;
            case 7:
                diaDaSemana = "sábado";
                break;
            default:
                diaDaSemana = "Número inválido! Digite um número entre 1 e 7.";
                break;
        }

        System.out.println("O dia correspondente ao número " + numeroDia + " é " + diaDaSemana + ".");
    }
}
