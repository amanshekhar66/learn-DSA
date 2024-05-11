package Arrays.Theory;

public class BinarySearhc {
    public static int Binary_Search(int arr[],int si,int ei,int val){
        while(si<=ei){
            int mid = (si+ei)/2;
            if(arr[mid]==val){
                return mid;
            }
            else if(arr[mid]>val){
                ei = mid-1;
            }
            else if(arr[mid]<val){
                si = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.println("aman");
        System.out.println(Binary_Search(arr,0,arr.length-1,6));
    }
}
