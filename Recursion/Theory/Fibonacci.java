package Recursion.Theory;

public class Fibonacci {
    public static int Fibonacci_N(int n){
        if(n==0 || n==1){
            return n;
        }
        int fn = Fibonacci_N(n-2) + Fibonacci_N(n-1);
        return fn;
    }
    public static void main(String[] args) {
        System.out.println(Fibonacci_N(5));
    }
}
