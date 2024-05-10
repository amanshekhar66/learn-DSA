package Pattern;

public class RotatedHalfPyr {
    public static void RotatedHalf_Pyr(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=4;j++){
                if(j<=n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        RotatedHalf_Pyr(4);
    }
}
