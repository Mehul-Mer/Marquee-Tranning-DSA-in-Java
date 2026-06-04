import java.util.Scanner;
public class RotateAnArray{
    public static void RotateArray(int n,Scanner sc,int[] arr){
        int d = sc.nextInt();
        int[] temp = new int[n];
        for(int i =0 ;i<n ; i++){
            temp[i] = arr[(d + i)%n];
        }
        for(int i =0 ;i<n ; i++){
            arr[i] = temp[i];
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        RotateArray(n,sc,arr);
        sc.close();
    }
}