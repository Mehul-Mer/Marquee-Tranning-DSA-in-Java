public class sumofevennumber {
    public static void main(int ncr , int npr) {
        Ncr(ncr);
        Npr();
    }
    public static void Npr(){
        int n = 2;
        int r = 4;
        int factn = 0;
        int factnr = 0;
        for(int i = 1; i<=n ; i++){
            factn *= i;
        }
        for(int i =1 ; i<=(n-r) ; i++){
            factnr *= i;
        }
        
        System.out.println(factn / factnr);
        Ncr(factn / factnr);

    }
    public static void Ncr(int factn ,int factnr){
        int r = 4;
        int factr = 0; 
        for(int i = 1; i<=r ; i++){
            factr *= i;
        }
        int ncr = factn/(factr * factnr);
        System.out.println(ncr);
    }
}
