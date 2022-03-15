package Sepa1;
public class ClassJava {
    public static void main(String[] args) {
        
        Player p1 = new Player(1); // new passa os valores de (Player para a vareavel (p))
        Player p2 = new Player(2);
        Player p3 = new Player(3);

        
        System.out.printf("\n o player (%d) tem (%d) vidas", p1, p1.getLife() );

    }
}
  