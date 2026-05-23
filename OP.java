import java.util.Scanner;

public class OP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextShort();
        int Sum = 0;
        while (num1>0){
            Sum = Sum + num1%10;
            num1/=10;
        }
        System.out.println(Sum);

    }

}
    
