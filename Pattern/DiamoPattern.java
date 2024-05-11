package Pattern;

public class DiamoPattern {
    public static void Diamond_Pattern(int n){
        int StarCount = 1;
        int SpaceCount =n-1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=SpaceCount+StarCount;j++){
                if(j<=SpaceCount){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
           
            SpaceCount--;
            StarCount+=2;
            System.out.println();
           
        }

        SpaceCount++;
        StarCount-=2;

        for(int i=n;i>=1;i--){
            for(int j=1;j<=SpaceCount+StarCount;j++){
                if(j<=SpaceCount){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            SpaceCount++;
            StarCount-=2;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("aman");
        Diamond_Pattern(7);
    }
}
