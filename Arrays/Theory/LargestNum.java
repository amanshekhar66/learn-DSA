package Arrays.Theory;

public class LargestNum {
    public static int LargestNum_InArray(int arr[]){
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {4,7,5,9,20,99,235};
        System.out.println(LargestNum_InArray(arr));
    }
}
