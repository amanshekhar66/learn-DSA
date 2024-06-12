package BitManipulation.Theory;

public class BitIntro {
    /*
        & operator : (AND OPERATOR)
        0 & 0 = 0
        1 & 0 = 0
        0 & 1 = 0
        1 & 1 = 1

        | operator : (OR OPERATOR)
        0 | 0 = 0
        1 | 0 = 1
        0 | 1 = 1
        1 | 1 = 1

        ^ operator : (XOR OPERATOR) => Different bit = 1 || Same bits = 0
        0 ^ 0 = 0
        1 ^ 0 = 1
        0 ^ 1 = 1
        1 ^ 1 = 0

        ~ operator : (NOT OPERATOR)
        ~0 = 1
        ~1 = 0

        Least Significant bit => The bit present in the rightmost end of the binary number
        Most Significant bit => The bit present in the leftmost end of the binary number
        Ex:   (MSB)100000000001(LSB)
        => If MSB = 1, the number is negative
        => If MSB = 0, the number is positive

        LEFT SHIFT OPERATOR (<<)
        a<<b = a * Math.pow(2,b)
        Suppose a = 0000110 and b = 2,
        a<<b => means that we have to shift all the bits of a towards the left by two places and fill the 
                two place gap present in the right by zero
        => a<<b = 0011000

        RIGHT SHIFT OPERATOR (<<)
        a>>b = a / Math.pow(2,b)
        Suppose a = 0000110 and b = 2,
        a>>b => means that we have to shift all the bits of a towards the right by two places and fill the 
                two place gap present in the left by zero
        => a>>b = 0000001

     */
    public static void main(String[] args) {
        System.out.println(~5);
        System.out.println(~(~5) + 1);
        System.out.println(6<<2); // 6 * Math.pow(2,2) = 24
        System.out.println(6>>2); // 6 / Math.pow(2,2) = 1.5 => Int(1.5) = 1
    }
}
