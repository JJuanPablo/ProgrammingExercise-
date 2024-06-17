import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o valor da compra:");
        double valorCompra = in.nextDouble();

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1. Débito");
        System.out.println("2. Crédito");
        System.out.println("3. Pix");
        int formaPagamento = in.nextInt();

        double totalPagar = 0;

        switch (formaPagamento) {
            case 1: // Débito: desconto de 5%
                totalPagar = valorCompra * 0.95;
                break;
            case 2: // Crédito
                System.out.println("Digite o número de parcelas:");
                int parcelas = in.nextInt();
                if (parcelas <= 4) {
                    // Juros simples de 2% em parcelamento até 4 vezes
                    totalPagar = valorCompra * 1.02;
                } else {
                    // Juros simples de 5% em parcelamentos superior a 4 vezes
                    totalPagar = valorCompra * 1.05;
                }
                break;
            case 3: // Pix: desconto de 10%
                totalPagar = valorCompra * 0.9;
                break;
            default:
                System.out.println("Opção inválida!");
                return;
        }

        System.out.println("Total a pagar: R$" + totalPagar);
    }
}
