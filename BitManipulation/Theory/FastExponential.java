package BitManipulation.Theory;

public class FastExponential {
    public static int FastExpo(int a, int n){
        int ans = 1;
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1){
                ans = ans * a;
                a = a *a;
                count ++;
            }
            n = n >> 1;
        }
        if(count == 1){
            ans = ans * ans;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(FastExpo(3,2));
    }
}
