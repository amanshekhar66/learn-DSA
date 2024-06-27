package BitManipulation.Assignment;

public class SwapTwoNos {
    public static void SwapTwoNos_WithoutThirdVar(int a, int b){
        a= a + b;
        b = a - b;
        a= a - b;
        System.out.println(a + " and " + b);
    }
    public static void main(String[] args) {
        SwapTwoNos_WithoutThirdVar(2,3);
    }
}
