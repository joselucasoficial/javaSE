public class MetodosJava {
    public static void main(String[] args) {
        
        int r;

        canal("canal ", 4);
        r = soma2(10, 5);
        System.out.println(r);
        System.out.println(soma2(23,2));
        System.out.println(soma(10, 8, 2, 5));
    }

    public static int soma(int... numeros){
        int res = 0;
        for(int n : numeros){
            res+=n;
        }
        return res;
    }

    public static int soma2(int n1, int n2){
        int res = n1 + n2;
        return res;
    }

    public static void canal(String m, int l){
        for(int i = 0; i < l; i++){
            System.out.println(m);
        }
    }
}
