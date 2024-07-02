package Recursion.Theory;

public class SortedArr {
    public static boolean isSortedArr(int arr[],int i){
        if(i== arr.length-1){
            return true;
        }
        if(arr[i]> arr[i+1]){
            return false;
        }
        return isSortedArr(arr, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(isSortedArr(arr, 0));
    }
}
