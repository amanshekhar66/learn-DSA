package Pattern;

public class ButterflyPattern {
    public static void Butterfly_Pattern(int n){
        for(int i=1; i<=n/2;i++){
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print("*");
                }
                else if(j>n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }  
            }
            System.out.println();
        }
        for(int i=n/2; i>=1;i--){
            for(int j=1;j<=n;j++){
                if(j<=i){
                    System.out.print("*");
                }
                else if(j>n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }  
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Butterfly_Pattern(8);
    }
}
