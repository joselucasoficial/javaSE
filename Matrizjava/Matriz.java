public class Matriz{
    public static void main(String[] args) {

        // primeiro atributo de matriz
        String[][] nomes = new String[3][4]; // atribuindo uma matriz com instanciação
        nomes[0][0] = "carros"; // atribuindo "carros", na linha 0 na coluna 0

        // segundo atributo de matriz sem instanciação, direto na vareavel
        // as linhas da matriz são criadas das seguintes formas {{linha 1},{linha 2}} separadas por virgulas, ja as colunas são atribuidas dentro das linhas e separadas por virgulas exemplo {{coluna 1, coluna 2}}.
        String[][] nomes2 = {{"calona 1", "coluna 2", "coluna 3"},{"calona 1", "coluna 2", "coluna"}};
        System.out.println(nomes2[0][2]); // impressão
        
    }
}