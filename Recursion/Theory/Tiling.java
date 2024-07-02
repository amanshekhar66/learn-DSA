package Recursion.Theory;

public class Tiling {
    public static int Tiling_Problem(int n){
        if(n==0 || n==1){
            return 1;
        }
        return Tiling_Problem(n-2) + Tiling_Problem(n-1);
    }
    public static void main(String[] args) {
        System.out.println(Tiling_Problem(4));
    }
}
