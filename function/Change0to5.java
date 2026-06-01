import java.util.Scanner;
public class Change0to5 {
    
    public static int change0to5(int n){
        if(n == 0) return 5;
        int temp = 0;
        int res = 0;
        while (n > 0){
            int rem = n % 10;
            if(rem == 0){
                temp = temp * 10 + 5;
            }
            else{
                temp = temp * 10 + rem;
            }
            n /= 10;
        }
        while (temp > 0){
            res = res * 10 + (temp % 10);
            temp /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(change0to5(n));
        sc.close();
    }
}
