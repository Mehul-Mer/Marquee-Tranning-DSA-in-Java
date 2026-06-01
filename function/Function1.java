import java.util.Scanner;
public class Function1 {
    public static boolean Prime(int a){
        if(a < 2){
            return false;
        }
        for(int i =2;i<a;i++){
            if(a % i == 0){
                return false;
            }
        }
        return true;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        boolean result = Prime(a);
        System.out.println(result);
    }
}