public class Player { // classe publica 

    private final int maxLife = 3; // constante de limite maximo
    private int num = 0; // vareavel local, só é exibita dentro da classe
    private int life = 0;

    public Player(int num){  // construtor esta sendo acessada da classe ClassJava (main)

        this.num = num; // this referencia ao objeto da classe, no caso a vareavel num
        this.life=0;
        //System.out.printf("jogador numero %d criado \n", num);
    }

    public int getLife(){ // metado tipo get pega o valor de alguma lugar
        return this.life; // retorna o valor de life passado no construtor
    }


    public void addLife(){ // metado tipo set
        if(this.life < maxLife){
            this.life++; // incremenro
        }
        
    }
}
