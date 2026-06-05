import java.util.Scanner;
public class DigitGame3232 {
    public static boolean Game(int[] arr,int n){
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0 ; i<n ; i++){
            if(arr[i]<10){
                sum1+=arr[i];
            }else{
                sum2+=arr[i];
            }    
        }
        return sum1 != sum2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        Game(arr,n);
        
    }
}
