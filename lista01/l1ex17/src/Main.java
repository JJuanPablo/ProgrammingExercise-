import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double velocidadeInicial, aceleracao, tempo, velocidadeFinal;

        System.out.println("Digite a velocidade inicial:");
        velocidadeInicial = in.nextDouble();

        System.out.println("Digite a aceleração:");
        aceleracao = in.nextDouble();

        System.out.println("Digite o tempo de percurso:");
        tempo = in.nextDouble();

        velocidadeFinal = velocidadeInicial + (aceleracao * tempo);

        System.out.println("A velocidade final é: " + velocidadeFinal);
    }
}
