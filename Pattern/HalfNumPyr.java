package Pattern;

public class HalfNumPyr {
    public static void HalfNum_Pyr(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        HalfNum_Pyr(5);
    }
}
