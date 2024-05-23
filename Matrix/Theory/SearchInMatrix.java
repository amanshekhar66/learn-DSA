package Matrix.Theory;
import java.util.*;

public class SearchInMatrix {
    public static void SearchIn_Matrix(int arr[][], int val){
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == val){
                    found = true;
                    System.out.println("Found at (" + i + "," + j + ")");
                    break;
                }
            }
            if(found){
                break;
            }        }

    }
    public static void LargestElIn_Matrix(int arr[][]){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
           
        }
        System.out.println("Largest element in the matrix is " + max);
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int arr[][] = new int[3][3];

            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    arr[i][j] = sc.nextInt();
                }
            }
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            SearchIn_Matrix(arr, 1);
            LargestElIn_Matrix(arr);
        }
    }
}
