import java.util.Scanner;
public class perfectsqure {
    public static void main(String[] args) {
        for(int i = 1; i<=80;i++){
            if (i*i >=20 && i*i <=80){
                System.out.println(i*i);
            }
        }
    }
    
    public static void cube(){
        Scanner sc= new Scanner(System.in);
        int first = sc.nextInt();
        int last = sc.nextInt();
            for(int i = first; i<=last/i;i++){
            if (i*i*i >=first && i*i*i<=last){
                System.out.println(i*i*i);
            }
        }

    }
}