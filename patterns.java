public class patterns {
    public static void main(String[] args) {
       /* int max = 60;
        int min = 18;
        while(min != 0){
            int rem = max % min;
            max = min;
            min = rem;
        }
        System.out.println(max);*/
        int n = 5;
        for(int i=1; i<=n ; i++){
            for(int j=1 ; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }   
}
