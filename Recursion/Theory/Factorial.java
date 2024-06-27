package Recursion.Theory;

public class Factorial {
    public static int Factorial_N(int n){
        if(n==0){
            return 1;
        }
        int fn = n*Factorial_N(n-1);
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(Factorial_N(5));
    }
}
