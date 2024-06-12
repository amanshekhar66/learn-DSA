package BitManipulation.Theory;

public class OddOrEven {
    public static void OddOr_Even(int num){
        if((num & 1) == 1){
            System.out.println("The given number is odd");
        }
        else{
            System.out.println("The given number is even");
        }
    }
    public static void main(String[] args) {
        OddOr_Even(5);
    }
}
