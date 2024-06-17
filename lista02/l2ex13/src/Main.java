import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escolha uma forma geométrica:");
        System.out.println("1. Círculo");
        System.out.println("2. Triângulo Retângulo");
        System.out.println("3. Retângulo");
        int escolha = in.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite o raio do círculo:");
                double raio = in.nextDouble();
                double areaCirculo = Math.PI * raio * raio;
                double perimetroCirculo = 2 * Math.PI * raio;
                System.out.println("Área do círculo: " + areaCirculo);
                System.out.println("Perímetro do círculo: " + perimetroCirculo);
                break;
            case 2:
                System.out.println("Digite a base do triângulo retângulo:");
                double base = in.nextDouble();
                System.out.println("Digite a altura do triângulo retângulo:");
                double altura = in.nextDouble();
                double areaTriangulo = (base * altura) / 2;
                double perimetroTriangulo = base + altura + Math.sqrt(base * base + altura * altura);
                System.out.println("Área do triângulo retângulo: " + areaTriangulo);
                System.out.println("Perímetro do triângulo retângulo: " + perimetroTriangulo);
                break;
            case 3:
                System.out.println("Digite a base do retângulo:");
                double baseRet = in.nextDouble();
                System.out.println("Digite a altura do retângulo:");
                double alturaRet = in.nextDouble();
                double areaRetangulo = baseRet * alturaRet;
                double perimetroRetangulo = 2 * (baseRet + alturaRet);
                System.out.println("Área do retângulo: " + areaRetangulo);
                System.out.println("Perímetro do retângulo: " + perimetroRetangulo);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
