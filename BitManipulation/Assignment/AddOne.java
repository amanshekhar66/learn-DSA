package BitManipulation.Assignment;

public class AddOne {
    public static int addOne(int number) {
        // int mask = 1;

        // while ((number & mask) != 0) {
        //     number = number ^ mask;
        //     mask <<= 1;
        // }

        // number = number ^ mask;
        return number | 1;
    }
    public static void main(String[] args) {
        System.out.println(6);
    }
}
