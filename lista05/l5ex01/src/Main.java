public class Main {
    public static void main(String[] args) {


        int n = 5;
        int resultado = soma(n);
        System.out.println("A soma de 1 até " + n + " é: " + resultado);




    }

    static int soma(int n){
        if (n <= 0){
            throw new IllegalArgumentException("N deve ser maior que 0");
        }

        int soma = 0;
        for (int i = 0; i <= n; i++) {
            soma += i;
        }
        return soma;


    }

}