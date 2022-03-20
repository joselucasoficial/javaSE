public class CursoJava2 {
    public static void main(String[] args) { // coments

        String aluno = "doidera"; // vareavel string 
        int nota = 70; // vareavel inteiro
        int media = 60; // vareavel inteiro
        int faltas = 10; // vareavel inteiro
        int maxFaltas = 5; // vareavel iteiro
        String res;

        res = (nota >= media ? "Aprovado" : "Reprovado"); // condição ternaria if ternaria  
        System.out.println("Resultado: " + res);

        if(nota >= media && faltas <= maxFaltas){
            System.out.printf("\nAprovado\n%s sua nota foi %d\n",aluno,nota);
        }else if(nota >= 50){
            System.out.printf("Recuparação\n%s sua nota foi %d\n", aluno, nota);
        }else {
            System.out.printf("\nReprovado\n%s sua nota foi %d\n", aluno, nota);
        }
        
    }
}
        // Tabela verdade AND &&, para retornar true todos teram que ser Verdadeiros
        /*
            V V = V
            V F = F
            F V = F
            F F = F
        */
        // Tabela verdade OR ||
        /*
            V V = V
            V F = V
            F V = V
            F F = F
        */
