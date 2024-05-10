package Pattern;

public class ZeroTriangle {
    public static void Zero_Triangle(int n){
        int count =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count);
                if(count ==0){
                    count =1;
                }
                else{
                    count = 0;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Zero_Triangle(5);
    }
}
