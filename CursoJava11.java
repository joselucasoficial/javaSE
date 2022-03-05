public class CursoJava11 {
    public static void main(String[] args) {
        
        final int tam = 5;
        char[] gabarito = {'a', 'b', 'c', 'd', 'a'};
        char[] respostas = new char[tam];
        int nota;

        for(int i = 0; i < tam; i++){
            System.out.printf("Informe a responta %d", i)
        }
        for(int i = 0; i < tam; i++){
            if(respostas[i] == gabarito[i]){
                nota++;
            }
            
        }

        System.out.printf("Seu resultado foi %d :", )
    }
}
