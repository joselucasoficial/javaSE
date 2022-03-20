import java.util.Scanner;

public class CursoJava10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double pesoideal;
        double altura;
        char sexo;
        
        System.out.println("Qual a sua altura ?");
        altura = scan.nextDouble();
        System.out.println("qual o seu sexo ?: \nf para feminino \nm para masculino\n");
        sexo = scan.next().charAt(0);
        
        if(sexo == 'm' || sexo == 'M'){
            pesoideal = (72.7 * altura) - 58;
        }else{
            pesoideal = (62.1 * altura) - 44.7;
        }
        System.out.printf("O seu peso ideal é:" + pesoideal);

    }

    /*
    calculo de peso ideal:
    para homens: (72.7 * h) - 58
    para mulheres (62.1 * h) - 44.7
    */
}
