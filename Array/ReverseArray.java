public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,1,2,3,4};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0 ; j < arr.length ; j++){
                if(arr[i] == arr[j]){
                    if(i - j > max){
                        max = i-j;
                    }
                }
            }
            
        }
        if(max < 0){
            max = max * - 1;
        }
        System.out.println(max);
    }
    
}    
