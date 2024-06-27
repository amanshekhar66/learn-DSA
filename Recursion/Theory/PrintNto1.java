package Recursion.Theory;

public class PrintNto1 {
    public static void PrintNTO_1(int n){
        if(n==1){
            System.out.println("1"+" ");
            return;
        }
        System.out.println(n+" ");
        PrintNTO_1(n-1);
    }
    public static void Print1TO_N(int n){
        if(n==1){
            System.out.println(n+" ");
            return;
        }
        Print1TO_N(n-1);
        System.out.println(n+" ");
    }
    public static void main(String[] args) {
        PrintNTO_1(15);
        Print1TO_N(5);
    }
}
