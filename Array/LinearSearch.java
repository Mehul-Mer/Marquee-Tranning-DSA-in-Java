package Array;
import java.util.Scanner;
public class LinearSearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
            int a = arr[i];
            System.out.print(arr[i] + " ");
        }
        sc.close();
        linearsearch(arr);
    }
    public static boolean linearsearch(int[] arr) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                return true;
            }
        }
        sc.close();
        return false;  
    }
}
