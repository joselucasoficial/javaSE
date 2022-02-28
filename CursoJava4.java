import java.util.Scanner;

public class CursoJava4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // a vareavel scan recebe a classe Scanner, que recebe informação do teclado

        int humor ; // vareavel
        int ida = 0; // vareavel
        String name = " "; // vareavel
        String pname = " "; // vareavel
        String sname = " "; // vareavel


        System.out.println("qual seu primeiro nome ?"); 
        pname = scan.nextLine(); // pname recebe o valor que foi digitado no teclado
        System.out.println("agora seu sobrenome");
        sname = scan.nextLine(); // sname recebe o valor que foi digitado no teclado
        System.out.println("qual sua idade");
        ida = scan.nextInt(); // ida recebe o valor que foi digitado no teclado
        System.out.println("De 1 a 5 qual sua nota para este serviço:\n\n1 para Muito insatisfeito \n2 para Insatisfeito \n3 para Razoavel \n4 para Satisfeito \n5 para Muito satisfeito \nSua opnião não é obrigatorio\n");
        humor = scan.nextInt(); // humor recebe o valor da avaliação recebe que foi digitado no teclado

        name = pname + " " + sname; // name recebe o valor de pname e calcatena com sname

        switch(humor){ // caso seja digitado algum dos valores solicidado o comando sera executado
            case 1:
            System.out.printf("\nOlá %s seu resultado ficou assim:\nNome: %s \nIdade: %d \nAvaliação: Muito Insatisfeito", pname, name, ida);
            break;
                
            case 2:
            System.out.printf("\nOlá %s seu resultado ficou assim:\nNome: %s \nIdade: %d \nAvaliação: Insatisfeito\n", pname, name, ida);
            break;

            case 3:
            System.out.printf("\nOlá %s seu resultado ficou assim:\nNome: %s \nIdade: %d \nAvaliação: Razoavel\n", pname, name, ida);
            break;

            case 4:
            System.out.printf("\nOlá %s seu resultado ficou assim:\nNome: %s \nIdade: %d \nAvaliação: Satisfeito\n", pname, name, ida);
            break;

            case 5:
            System.out.printf("\nOlá %s seu resultado ficou assim:\nNome: %s \nIdade: %d \nAvaliação: Muito Satisfeito\n", pname, name, ida);
            break;

            default:
            System.out.printf("\nOlá %s seu resultado ficou assim:\nNome: %s \nIdade: %d \nAvaliação: Sem Opnião\n", pname, name, ida);
            break;
        }

        System.out.print("\n\n Obrigado pela sua participação\n\n"); // mensagem final 

    }
}
