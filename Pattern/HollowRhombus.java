package Pattern;

public class HollowRhombus {
    public static void Hollow_Rhombus(int n){
        int SpaceCount = n/2;
        int LastCount = 0;
      for(int i=1; i<=n/2+1;i++){
        for(int j=1;j<=n;j++){
            if(i==1 || i==n/2+1){
                if(j<=SpaceCount){
                    System.out.print(" ");
                }
                else if(j<=n-LastCount){
                    System.out.print("*");
                }
            }
            else{
                if(j==SpaceCount+1){
                    System.out.print("*");
                }
                else if(j==n-LastCount-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
        }
        SpaceCount--;
        LastCount++;
        System.out.println();
      }
    }
    public static void main(String[] args) {
        Hollow_Rhombus(12);

    }
}
