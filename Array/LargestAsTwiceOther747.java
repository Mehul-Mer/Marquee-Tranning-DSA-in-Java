public class LargestAsTwiceOther747 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8};
                int n = arr.length;
        int index = -1;
        int max = -1;
        int second_max = -1;
        for(int i=0 ; i<n ; i++){
            if(arr[i]>max){
                second_max = max;
                max = arr[i];
                index = i;
            }else if(arr[i] > second_max){
                second_max = arr[i];

            }
        }
        if(max >= 2*second_max){
            System.out.println(index);
        }else{
            System.out.println(-1);
        }

    }
        
    
}
