package maths;
public class evencheck {
    public static void main(String[] args) {
        int count = 0;
        int second = 0;
        int rev = 0;
        int num = 2445;
        while(num>0){
            rev = rev * 10 + rev % 10;
            num/=10;
            if(num >10 && num <100){
                second = num % 10;
            }

        }
        if(second % 2 == 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}