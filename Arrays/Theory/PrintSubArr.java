package Arrays.Theory;

public class PrintSubArr {
    public static void PrintSub_Arr(int arr[], int val){
        int max = Integer.MIN_VALUE;
        boolean SubArrExist = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                System.out.print("(");
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                    if(k!=j){
                        if(sum % val ==0 & k>=2){
                            SubArrExist = true;
                        }
                        System.out.print(arr[k]+",");
                    }
                    else{
                        System.out.print(arr[k]);
                    }
                }
                if(sum>max){
                    max=sum;
                }
               // System.out.print(")"+ " ");
            }
            //System.out.println();
        }
        System.out.println("Maximum sum of the subarray is "+max);
        System.out.println(SubArrExist);
    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,6,2,3,5,8};
        PrintSub_Arr(arr,11);
    }
}
