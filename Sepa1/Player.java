public class Player { // classe publica esta sendo acessada da classe ClassJava (main)

    private int num = 0;
    private int life = 0;

    public Player(int num){  // classe construtora
        this.num = num;
        this.life = 3; 
        //System.out.printf("jogador numero %d criado \n", num);
    }

    public int getLife(){ // metado tipo get pega o valor de alguma lugar
        return this.life; // retorna o valor de life passado no construtor
    }
}
