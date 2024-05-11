package Arrays.Theory;

public class PrefixSumArr {
    public static int MaxSumSub_Arr(int arr[]){
        int max = Integer.MIN_VALUE;
        int prefixarr[] = new int[arr.length];
        prefixarr[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefixarr[i] = prefixarr[i-1] + arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start = i;
            int sum = 0;
            for(int j=i;j<arr.length;j++){
                int end =j;
                sum = start== 0? prefixarr[end] : prefixarr[end] - prefixarr[start-1]; //formula
            }
            if (sum>max){
                max = sum;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,8};
        System.out.println(MaxSumSub_Arr(arr));
    }

}
