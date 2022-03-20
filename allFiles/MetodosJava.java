public class MetodosJava {
    public static void main(String[] args) {
        
        int r;

        canal("canal ", 4);
        r = soma2(10, 5);
        System.out.println(r);
        System.out.println(soma2(23,2)); // passando dois valores separados por ',' sera feito a soma dos parametros e retornado o valor
        System.out.println(soma(10, 8, 2, 5)); // impressão do metado soma, que retorna a soma dos valores inteiro
    }

    // tipos de metodos de classe

    // quando for static tudo deve ser static, quando for int tudo deve ser inteiro
    public static int soma(int... numeros){// soma recebe 1 ou mais numero inteiro em forma de array armazenado em numeros. 
        int res = 0;  // res recebe o valor 0
        for(int n : numeros){ // neste metado o for faz a impressão dos valores passados para numeros.
            res+=n; // recebe os valores somados juntos
        }
        return res; // retorno do metado para o main
    }

    public static int soma2(int n1, int n2){ // soma2 recebe dois parametros inteiros n1 e n2
        int res = n1 + n2; // res recebe o valor dos parametros que serão passados no main
        return res; // retorna o valor de n1 e n2, apos ser chamada em main
    }

    public static void canal(String m, int l){// metado que imprime o valor quantas vezes for chamado
        for(int i = 0; i < l; i++){// sera mostrado o valor do primeiro paramentro quantas vezes o valor do parametro for.
            System.out.println(m);
        }
    }
}
