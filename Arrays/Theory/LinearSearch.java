package Arrays.Theory;

public class LinearSearch {
    public static int Linear_Search(int arr[],int val){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==val){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,6,8};
        int n = Linear_Search(arr,8);
        System.out.println(n);
    }
}
