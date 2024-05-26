package Matrix.Assignment;

public class Asssgn1 {
    public static int NumberOfSevens(int arr[][], int num){
        int count = 0;
        for(int i =0; i<arr.length; i++){
            for(int j=0;j <arr[0].length; j++){
                if(arr[i][j] == num){
                    count ++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[][] = {{4,7,8}, {8,7,7}};
        System.out.println(NumberOfSevens(arr, 7));
    }
}
