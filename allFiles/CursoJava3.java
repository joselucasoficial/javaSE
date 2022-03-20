public class CursoJava3 {
    public static void main(String[] args) {
        
        int pos = 4; // vareavel inteiro

        switch(pos){
            case 1: // caso 01, caso seja este o valor da vareavel sera executado o comando a baixo
                System.out.println("primeiro lugar"); // metodo de impressão
            break; // caso seja true será executado o comando a cima e o break entra em ação
            
            case 2:
                System.out.println("segundo lugar"); // metodo de impressão
            break;

            case 3:
                System.out.println("terceiro lugar"); // metodo de impressão
            break;

            case 4:
                System.out.println("quarto lugar"); // metodo de impressão
            break;

            default:
                System.out.println("Não subiu no podio"); // metodo de impressão
            break;
        }
    }
}