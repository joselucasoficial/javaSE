//import java.util.Arrays; // importando o a classe Array

public class CursoJava13 {
    public static void main(String[] args) {

        final int tam = 6;
        int[] num = { 1, 3, 5, 8, 4, 4 }; // array int
        int[] numeros = new int[tam];

        //Arrays.sort(num); // sorte ordena de modo crescente, Arrays é um metado da classe Arrays

        //Arrays.fill(numeros, 10); // fill prenche o array com o valor passado 
        
        System.arraycopy(num, 0, numeros, 0, tam); // (origem, apartir do, destino, apartir do, quantidade de elementos a ser copiado)

        for (int n : numeros) { // for especial para leitura de um array, apenas leitura.
            System.out.printf("%d ", n); // inpressão formated
        }
    }
}
