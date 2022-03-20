public class obj2 {
    // atributos comuns não podem ser acessados por metados static

    String aluno; // atributo comun

    static String professor; // atributo static

    static void ensinar(){ // metodo static 
        System.out.println(professor + " ensinar");
    }
}