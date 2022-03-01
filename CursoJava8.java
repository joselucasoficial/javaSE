public class CursoJava8 {
    public static void main(String[] args) {
        

        int[] num = new int[5] ; // declaração de vareavel com instanciação de new array
        int[] numeros = {2, 3, 4, 5, 6}; // declaração de vareavel direto na vareavel

        num[0] = 10; // atribuindo o valor a posisão do array aplicada por []
        num[1] = 20; // atribuindo o valor a posisão do array aplicada por []
        num[2] = 30; // atribuindo o valor a posisão do array aplicada por []
        num[2] = 30; // atribuindo o valor a posisão do array aplicada por []
        num[3] = 40; // atribuindo o valor a posisão do array aplicada por []
        num[4] = 50; // atribuindo o valor a posisão do array aplicada por []
        
        for(int i = 0; i < numeros.length ; i ++){ // percorre o array e mostra todos os redesultados de cada posição
            System.out.printf("%d - ",numeros[i]);
        }
        
    }
}