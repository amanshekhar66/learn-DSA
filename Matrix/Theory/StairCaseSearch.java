package Matrix.Theory;

public class StairCaseSearch {
    public static void SearchIn_SortedMatrix(int arr[][], int key){
        int col = arr[0].length-1;
        boolean found = false;

        for(int i=0;i<arr.length;i++){
            if(key< arr[i][col]){
                col--;
                i=-1;
            }
            else if(key == arr[i][col]){
                System.out.println("Key found at (" + i + "," + col + ")");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Key is not present in the matrix");
        }

    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}, {16,17,18,19,20}, {21,22,23,24,25}};
        SearchIn_SortedMatrix(arr, 23);
    }
}
