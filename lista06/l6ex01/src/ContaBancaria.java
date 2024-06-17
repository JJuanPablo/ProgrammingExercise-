import java.util.Scanner;

public class ContaBancaria {
    private int numero;
    private double saldo;
    private String titular;


    public ContaBancaria(int numero, double saldo, String titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }


    public void depositar(double valor) {
        saldo += valor;
    }


    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }


    public void verificarSaldo() {
        System.out.println("Saldo atual: R$" + saldo);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        ContaBancaria conta = new ContaBancaria(12345, 1000.0, "João");


        conta.verificarSaldo();
        System.out.println("Realizando um depósito de R$500...");
        conta.depositar(500.0);
        conta.verificarSaldo();
        System.out.println("Realizando um saque de R$200...");
        conta.sacar(200.0);
        conta.verificarSaldo();
        System.out.println("Tentando sacar R$1000...");
        conta.sacar(1000.0);
        conta.verificarSaldo();


    }
}
