package Arrays.Theory;

public class Kadane {
    public static int MaxSumSub_Arr(int arr[]){
        int MaxSum = Integer.MIN_VALUE;
        int CurrSum = 0;
        boolean AllValNeg = true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                AllValNeg = false;
            }
            if(!AllValNeg){
                MaxSum = Integer.MIN_VALUE;
                break;
            }
            else{
                if(arr[i]>MaxSum){
                    MaxSum = arr[i];
                }
            }
        }
        if(!AllValNeg){
            for(int i=0;i<arr.length;i++){
                CurrSum = CurrSum + arr[i];
                if(CurrSum<0){
                    CurrSum = 0;
                }
                MaxSum = Math.max(MaxSum, CurrSum);
            }
            
        }
        return MaxSum;  
    }
    public static void main(String[] args) {
        int arr[] = {-2,-3,-4,-1,-2,-1,-5,-3};
        System.out.println(MaxSumSub_Arr(arr));
    }
    
}
