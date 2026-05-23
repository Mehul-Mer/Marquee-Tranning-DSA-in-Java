public class pyramid1 {
    public static void main(String[] args) {
        int n = 6;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
        }
        for(int i<=n; i>0 ; i--){
            for(int j=1 ; j<=i ; j++){
                System.out.print("* ");
            }
        }
        System.out.println();
    }
    
}
