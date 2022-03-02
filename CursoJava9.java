import java.util.Scanner;
public class CursoJava9 {
    public static void main(String[] args) {
        
        char op = 'a'; // unico caracter

        String nome = "lucas"; // sequencia de caracteres

        System.out.println(op == 'a'); // comparação de igual com ==, não é performatico.
        System.out.println(nome.equals("lucass")); // equals é o mesmo resultado de ==, porém mais performatico, mais usado no dia dia

    }
}
