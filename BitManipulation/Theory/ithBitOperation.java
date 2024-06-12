package BitManipulation.Theory;

public class ithBitOperation {
    public static int GetithBit (int n, int i){
        /*
        Logic :
        1<<i => It gives the number on which there is 1 only on the ith position
        n & 1<<i => Its more or less the odd/even case where the n has 1 on the ith bit, it will return 1 
                    else it will return 0
         */
        int bitmask = 1<<i;
        if ((n & bitmask) == 1){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static int SetithBit(int n, int i){ // we have to set the ith bit to 1, if its already 1, then its ok
        int bitmask = 1<<i;
        n = n | bitmask;
        return n;
    }
    public static int ClearithBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }
    public static int UpdateithBit(int n, int i, int bit){
        if(bit == 1){
           return SetithBit(n, i);
        }
        else{
            return ClearithBit(n, i);
        }
    }
    public static int AnotherWay2UpdateithBit(int n, int i, int newbit){
        /*
         logic
         After clearning, ith bit in n = 0 
         if newbit == 0 => 0<<i = 0 AND n | 0 = n
         */
        n = ClearithBit(n, i);
        int bitmask = newbit<<i;
        return n | bitmask;
        
    }
    public static int ClearlastiBits(int n, int i){
        for(int j =0;j<=i;j++){
            int bitmask = ~(1<<j);
            n = n & bitmask;
        }
        return n;
    }
    public static int AnotherWay2ClearlastiBits(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }
    public static int ClearRangeOfBits(int n, int i, int j){
        for(int k=i;k<=j;k++){
            int bitmask = ~(1<<k);
            n = n & bitmask;
        }
        return n;
    }
    public static int AnotherWay2learRangeOfBits(int n, int i, int j){
        int a = n & ((~0)<<j+1);
        int b = (1<<i) - i;
        int bitmask = a | b;
        n = n & bitmask;
        return n;
    }
    public static void main(String[] args) {
        System.out.println(SetithBit(10, 2));
        System.out.println(UpdateithBit(10, 2, 1));
        System.out.println(AnotherWay2UpdateithBit(10, 1, 0));
        System.out.println(ClearlastiBits(15, 1));
        System.out.println(AnotherWay2ClearlastiBits(15, 2));
        System.out.println(ClearRangeOfBits(10, 2, 4));
        System.out.println(AnotherWay2learRangeOfBits(10, 2, 4));
        
    }
}
