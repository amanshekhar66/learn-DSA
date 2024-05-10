package Pattern;

public class SolidRhombus {
    public static void Solid_Rhombus(int n){
        int SpaceCount = n/2;
        int LastCount = 0;
      for(int i=1; i<=n/2+1;i++){
        for(int j=1;j<=n;j++){
            if(j<=SpaceCount){
                System.out.print(" ");
            }
            else if(j<=n-LastCount){
                System.out.print("*");
            }
        }
        SpaceCount--;
        LastCount++;
        System.out.println();
      }
    }
    public static void main(String[] args) {
        Solid_Rhombus(12);

    }
}
