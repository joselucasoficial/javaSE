public class Player { // classe publica 

    private final int maxLife = 3;
    private int num = 0; // vareavel local, só é exibita dentro da classe
    private int life = 0;

    public Player(int num){  // construtor esta sendo acessada da classe ClassJava (main)

        this.num = num; // this referencia ao objeto da classe, no caso a vareavel num
        this.addLife(3);
        //System.out.printf("jogador numero %d criado \n", num);
    }

    public int getLife(){ // metado tipo get pega o valor de alguma lugar
        return this.life; // retorna o valor de life passado no construtor
    }

    public void setLife(int life){ // metado tipo set
        if(life > maxLife){
            this.life=maxLife;
        }else if(life < 0){
            this.life=0;
        }else{
            this.life = life;
        }
        
    }

    private void addLife(int life){ // metado tipo set
        if(life > maxLife){
            this.life=maxLife;
        }else if(life < 0){
            this.life=0;
        }else{
            this.life = life;
        }
        
    }
}
