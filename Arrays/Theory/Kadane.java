package Arrays.Theory;

public class Kadane {
    public static int MaxSumSub_Arr(int arr[], int k){
        boolean SubArrExist = false;
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
            int count = 0;
            for(int i=0;i<arr.length;i++){
                
                CurrSum = CurrSum + arr[i];
                count ++;
                if(CurrSum<0){
                    CurrSum = 0;
                }
                MaxSum = Math.max(MaxSum, CurrSum);
            }
            
        }

        return MaxSum;  
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,6,2,3,5,8};
        System.out.println(MaxSumSub_Arr(arr,11));
    }
    
}
