package Recursion.Theory;

import javax.swing.plaf.OptionPaneUI;

public class PowerOfX {
    public static int PowerOf_X(int x, int n){
        if(n==1){
            return x;
        }
        else if(n==0){
            return 1;
        }
        
        return x * PowerOf_X(x, n-1);
    }
    public static int OptimizedPowerOf_X(int x, int n){
        if(n==0){
            return 1;
        }
        int HalfPower = OptimizedPowerOf_X(x, n/2); //it makes the time complexity to logn
        if(n%2==0){
            return HalfPower * HalfPower;
        }
        else{
            return x * HalfPower * HalfPower;
        }
    }
    public static void main(String[] args) {
        System.out.println(PowerOf_X(10, 0));
        System.out.println(OptimizedPowerOf_X(9, 3));
    }
}
