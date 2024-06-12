package BitManipulation.Theory;

public class PowerOfTwo {
    public static boolean IsPowerof2(int n){
        return (n & (n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(IsPowerof2(6));
    }
}
