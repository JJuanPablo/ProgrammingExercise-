public class Main {
    // Função para realizar busca binária em um array ordenado de inteiros
    public static int buscaBinaria(int[] array, int elemento) {
        int inicio = 0;
        int fim = array.length - 1;

        while (inicio <= fim) {
            int meio = (inicio + fim) / 2;


            if (array[meio] == elemento) {
                return meio;
            }


            if (array[meio] > elemento) {
                fim = meio - 1;
            }

            else {
                inicio = meio + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int elemento = 11;

        int posicao = buscaBinaria(array, elemento);

        if (posicao != -1) {
            System.out.println("O elemento " + elemento + " está na posição " + posicao + " do array.");
        } else {
            System.out.println("O elemento " + elemento + " não foi encontrado no array.");
        }
    }
}
