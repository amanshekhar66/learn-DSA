package Matrix.Theory;

public class DiagonalSum {
    public static int DiagonalSum_Matrix(int arr[][]){
        int sum = 0;
        int col = 0;
        if(arr.length % 2 == 0){
            for(int i=0;i<arr.length;i++){
                sum = sum + arr[i][col++];
            }
            col-=1;
            for(int i = arr.length-1; i>=0; i--){
                sum = sum + arr[i][col--];
            }
        }
        if(arr.length % 2 != 0){
            for(int i =0;i<arr.length; i++){
                if(i != (arr.length/2)){
                    sum = sum + arr[i][col++];
                }
                else{
                    col++;
                }
            }
            col-=1;
            for(int i = arr.length-1; i>=0; i--){
                sum = sum + arr[i][col--];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
        System.out.println(DiagonalSum_Matrix(arr));
    }
}
