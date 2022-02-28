public class CursoJava {
    public static void main(String[] args) {

        int num = 100; // int usado para criação de variavel, quando nada é atribuido ele recebe por padrão o valor 0
        String nome = "José";

        System.out.print("quebraaaa\n"); // \n ou %n é um caracter de escape, quebra de linha
        System.out.print("curso java"); // somente o print não executa a quebra de linha
        System.out.println("curso java 2"); // printlnm executa quebra de linha no final
        System.out.printf("Aula: %s \nAno: %d ","Java", 2022); // printf, f é de formated | %s é de string | %d é de inteiro | %f é de ponto flutuante
        System.out.printf("Valor da variavel num:%d \nnome: %s%n", num, nome);// impressão da variavel
    }
}