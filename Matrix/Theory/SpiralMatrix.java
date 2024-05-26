package Matrix.Theory;

public class SpiralMatrix {
    public static void Print_SpiralMatrix(int arr[][]){
        int StartRow = 0;
        int StartCol = 0;
        int EndRow = arr.length-1;
        int EndCol = arr[0].length-1;

        while(StartRow <= EndRow){
            //top
            for(int j=StartCol;j<=EndCol;j++){
                System.out.print(arr[StartRow][j]+ " ");
            }

            //right
            for(int i=StartRow+1; i<=EndRow; i++){
                System.out.print(arr[i][EndCol]+ " ");
            }

            //bottom
            for(int j=EndCol-1;j>=StartCol;j--){
                System.out.print(arr[EndRow][j]+ " ");
            }

            //left
            for(int i=EndRow-1; i>=StartRow+1; i--){
                System.out.print(arr[i][StartCol]+ " ");
            }

            StartRow++;
            StartCol++;
            EndRow--;
            EndCol--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        Print_SpiralMatrix(arr);
    }
}

