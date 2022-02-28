import java.util.Scanner;

public class CursoJava7 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero:\n");
        int ent = scan.nextInt();
        int cont = 0;
        do{
            System.out.println(cont + " CFB Cursos");
            cont ++;
        }while(cont < ent);


    }
}
