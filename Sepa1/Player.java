package Sepa1;

public class Player { // classe publica esta sendo acessada da classe ClassJava (main)

    private int num = 0;
    private int life = 3;

    public Player(int num){  // classe construtora
        this.num = num;
    }

    public int getLife(){
        return this.life;
    }
}
