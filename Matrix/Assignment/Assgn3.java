package Matrix.Assignment;

public class Assgn3 {
    public static void MakeTranspose(int arr[][]){
        int Transpose[][] = new int[arr[0].length][arr.length];
        int newarr [] = new int[arr.length * arr[0].length];
        int pos = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                newarr[pos++] = arr[i][j];
            }
        }
        pos = 0;
        for(int i =0;i<Transpose.length;i++){
            for(int j=0; j<Transpose[0].length;j++){
                Transpose[i][j] = newarr[pos++];
            }
        }
        for(int i =0;i<Transpose.length;i++){
            for(int j=0; j<Transpose[0].length;j++){
                System.out.print(Transpose[i][j] + " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2}, {4,5}, {7,8}};
        MakeTranspose(arr);
    }
}
