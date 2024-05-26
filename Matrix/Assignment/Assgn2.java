package Matrix.Assignment;

public class Assgn2 {
    public static void SumOfSecondRow(int arr[][], int RowNo){
        int sum = 0;
        RowNo-=1;
        for(int j=0;j<arr[0].length;j++){
            sum = sum + arr[RowNo][j];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        SumOfSecondRow(arr, 2);
    }
}
