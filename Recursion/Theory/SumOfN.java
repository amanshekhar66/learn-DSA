package Recursion.Theory;

public class SumOfN {
    public static int SumOf_N(int n){
        if(n==1){
            return 1;
        }
        return n + SumOf_N(n-1);
    }
    public static void main(String[] args) {
        System.out.println(SumOf_N(5));
    }
}
