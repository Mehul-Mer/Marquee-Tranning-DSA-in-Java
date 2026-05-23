import java.util.Scanner;

public class amstrongnumber {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1 = 0;
        int sum = 0;
        int squ = 0;
        while(num>0){
            num1 = num%10;
            squ = num1 * num1 * num1;
            sum = sum + squ;
            num/=10;

        }
        if(num1 == num){
            System.out.println("Armstrong");

        }else{
            System.out.println("Not Armstrong");
        }
    }
}
