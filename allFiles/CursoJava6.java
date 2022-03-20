import java.util.Scanner;

public class CursoJava6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max = scan.nextInt();

        // while, para quando não souber a quantidade de vezes que devo executar o codigo.
        int cont = 0; // contador
        while(cont < max){ // Condição de execução
            System.out.println(cont + " - CFB Cursos"); // comando a ser executado
            cont++; // incremento ou decremento
        }

        System.out.println("Fim do Programa");
    }
}
