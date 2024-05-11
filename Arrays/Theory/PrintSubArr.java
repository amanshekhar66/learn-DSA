package Arrays.Theory;

public class PrintSubArr {
    public static void PrintSub_Arr(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                System.out.print("(");
                for(int k=i;k<=j;k++){
                    sum=sum+arr[k];
                    if(k!=j){
                        System.out.print(arr[k]+",");
                    }
                    else{
                        System.out.print(arr[k]);
                    }
                }
                if(sum>max){
                    max=sum;
                }
                System.out.print(")"+ " ");
            }
            System.out.println();
        }
        System.out.println("Maximum sum of the subarray is "+max);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        PrintSub_Arr(arr);
    }
}
