public class CursoJava11 {
    public static void main(String[] args) {
        
        final int tam = 5; // constante com valor fixo
        char[] gabarito = {'a', 'b', 'c', 'd', 'a'}; // array com 5 itens inceridos
        char[] respostas = new char[tam]; // armazena a constante tam em um array quem tem o valor fixo
        int nota=0; // vareavel inteira que armazena o resultado final
        

        // este metodo as respostas foram passadas direto ao codigo sem uma classe Scanner
        respostas[0]='a';
        respostas[1]='b';
        respostas[2]='e';
        respostas[3]='d';
        respostas[4]='a';

        for(int i = 0; i < tam; i++){// contador, condição tam, e o incremento
            if(respostas[i] == gabarito[i]){ // se caso o calor passado em respostas a cima for o mesmo do gabarido a cada interação, o if retorna true e armazena em nota
                nota++;
            }
            
        }

        System.out.printf("Seu resultado foi %d :",nota ); // impressão
    }
}
