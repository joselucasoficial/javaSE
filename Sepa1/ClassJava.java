public class ClassJava {
    public static void main(String[] args) {
        
        int num = 0; // para iniciar a contagem dos jogadores

        Player p1 = new Player(++num); // new passa os valores de (Player para a vareavel (p))
        System.out.printf("a quantidade de vidas do Player %d é %d\n", num, p1.getLife() );

        Player p2 = new Player(++num); // new passa os valores de (Player para a vareavel (p))
        System.out.printf("a quantidade de vidas do Player %d é %d\n", num, p2.getLife() );

        Player p3 = new Player(++num); // new passa os valores de (Player para a vareavel (p))
        System.out.printf("a quantidade de vidas do Player %d é %d\n",num, p3.getLife() );


    }
}
  