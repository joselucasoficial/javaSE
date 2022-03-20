public class Matriz{
    public static void main(String[] args) {

        // primeiro atributo de matriz
        String[][] nomes = new String[3][4];
        nomes[0][0] = "carros";

        // segundo atributo de matriz sem instanciação, direto na vareavel
        String[][] nomes2 = {{"calona 1", "coluna 2", "coluna 3"},{"calona 1", "coluna 2", "coluna"}};
        System.out.println(nomes2[0][2]);
        
    }
}