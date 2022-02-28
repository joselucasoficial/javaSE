import java.util.Scanner;

public class CalculoIMC {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome; // vareavel string
        float peso, altura; // vareavel flutuante
        float imc;// vareavel flutuante
        String classifica; // vareavel string

        System.out.print("\n\nFAREMOS O CALCULO DO IMC, POR FAVOR INFORME SEUS DADOS A BAIXO.\n\n");
        System.out.print("Seu nome: ");
        nome = ler.nextLine();
        System.out.print("\nSeu peso por exemplo: 73(kg): ");
        peso = ler.nextFloat();
        System.out.print("\nSua altura por exemplo 1,76(m): ");
        altura = ler.nextFloat();
        ler.nextLine();

        imc = calcularIMC(peso, altura); // imc recebe a função com os parametros para ser feito o calculo

        classifica = resultadoIMC(imc); // clasifica recebe o resultado de resultadoIMC 

        System.out.printf("\n\nOlá "+ nome +" Seu resultado IMC é: %.1f - %s\n\n", imc, classifica); // impressão com os resultados finais

    }

    static float calcularIMC(float p, float h) { // calculo do IMC
        return p / (h * h); // o calculo imc é o meu peso dividido por duas vezes a minha altura
    }

    static String resultadoIMC(float imc) { // função que retorna o resultado do calculo calcularIMC
        String result;
        if (imc <= 19)
            result = "Abaixo do Peso";
        else if (imc <= 25)
            result = "Peso ideal";
        else if (imc <= 30)
            result = "Acima do Peso";
        else if (imc <= 35)
            result = "Obesidade Leve";
        else
            result = "Obesidade";

        return result; // retorna o resuldado do calculo 
    }

}
