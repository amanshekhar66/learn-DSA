package BitManipulation.Assignment;

public class FastExpoOfX {
    public static int ExponentOfX(int x){
        int ans = 1;
        int count = 0;
        int n = x;
        while(x > 0){
            if((x & 1) == 1){
                ans = ans * n;
                n = n * n;
                count ++;
            }
            x= x>>1;
        }
        if(count == 1){
            ans = ans * ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(ExponentOfX(8));
    }
}
