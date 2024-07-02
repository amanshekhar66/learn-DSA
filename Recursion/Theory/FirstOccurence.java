package Recursion.Theory;

public class FirstOccurence {
    public static int FirstOccurence_key(int arr[], int key, int i){
        if(arr[i] == key){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }
        return FirstOccurence_key(arr, key, i+1);
    }
    public static int LastOccurence(int arr[], int key, int i){
        if(arr[i]==key){
            return i;
        }
        if(i==0){
            return -1;
        }
        return LastOccurence(arr, key, i-1);
    }
    public static void main(String[] args) {
        int arr[] = {2,2,7,8,2};
        System.out.println(FirstOccurence_key(arr, 5, 0));
        System.out.println(LastOccurence(arr, 2, arr.length-1));
    }
}
