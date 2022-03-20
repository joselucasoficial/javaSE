import java.util.Scanner;

public class CursoJava12 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String play1 = ""; // var que armazena o jogador 1
        String play2 = ""; // var que armazena o jogador 2
        final int tam = 5; // constante com valor fixo
        char[] gabarito = {'a', 'e', 'd', 'c', 'b'}; // array char com os resustados
        char[] respostas1 = new char[tam];// aqui se armazena as respostas passadas pelo jogador 1
        char[] respostas2 = new char[tam];// aqui se armazena as respostas passadas pelo jogador 2
        int nota1 = 0;// vareavel com a quantidade de arry true
        int nota2 = 0;

        System.out.print("Nome do player 1: "); 
        play1 = scan.nextLine(); // recebe o nome do jogador 1
        System.out.print("Nome do player 2: ");
        play2 = scan.nextLine(); // recebe o nome do jogador 2

        System.out.printf("\n\n %s e %s tende acertar a sequencia de letras ( a - b - c - d - e ) na ordem correta, as letras são de a..e enbaralhadas, a maior pontuação vence, boa sorte. \n\nComeçaremos com o %s\n\n", play1 , play2, play1);


        // ############## player 1 ###############
        for(int i = 0; i < tam; i++){ // busca na tela as respostas até finalizar o tamanho do array
            System.out.printf("%s infome a posição %d: ", play1, i);
            respostas1[i] = scan.nextLine().charAt(0); 
        }

        for(int i = 0; i < tam; i++){
            if(respostas1[i] == gabarito[i]){ // caso seja true executa a baixo
                nota1++; // a cada interação true é armazenado o valor na vareavel nota
            }
        }
        // #######################################

        System.out.printf("\n\n Agora é o %s\n\n", play2); // aviso de troca de player

        // ############## player 2 ###############
        
        for(int i = 0; i < tam; i++){ // busca na tela as respostas até finalizar o tamanho do array
            System.out.printf("%s infome a posição %d: ", play2, i);
            respostas2[i] = scan.nextLine().charAt(0); 
        }

        for(int i = 0; i < tam; i++){ 
            if(respostas2[i] == gabarito[i]){// caso seja true executa a baixo
                nota2++; // a cada interação true é armazenado o valor na vareavel nota
            }
        }

        //############ RESUTADOS #############

        System.out.print("\n\n A sequencia correta é: ");
        for(int i = 0; i < gabarito.length; i++){ // percorre o array gabarito
            System.out.print(" " + gabarito[i]); // retorna com todo o array 
        }

        System.out.printf("\n\n %s sua pontuação foi: %d e a sequencia: ", play1, nota1);
        for(int i = 0; i < respostas1.length; i++){// percorre o array gabarito
            System.out.print(" " + respostas1[i]);// retorna com todo o array
        }

        System.out.printf("\n\n %s sua pontuação foi: %d e a sequencia: ", play2, nota2);
        for(int i = 0; i < respostas2.length; i++){// percorre o array gabarito
            System.out.print(" " + respostas2[i]);// retorna com todo o array
        }

        if(nota1 > nota2 ){ 
            System.out.printf("\n\n%s é o vencedor", play1); // caso seja maior
        }else if(nota2 > nota1){
            System.out.printf("\n\n%s é o vencedor", play2); // caso seja maior
        }else{
            System.out.print("\n\nEmpatouu"); // caso não seja nenhuma das alternativvas a cima
        }

        System.out.printf("\n\n\nObrigado por jogar %s e %s \n\n", play1, play2); // impressão final

    }
}
