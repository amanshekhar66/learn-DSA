package Pattern;

public class NumberPyramid {
    public static void PrintNumAltSpace(int n, int num,int SpaceCount){
       if(SpaceCount%2==0){
            if(n%2==0){
                System.out.print(" ");
            }
            else{
                System.out.print(num);
            }
        }
        else{
            if(n%2==0){
                System.out.print(num);
            }
            else{
                System.out.print(" ");
            }
        }
       
    }
    public static void Number_Pyramid(int n){
        int ColNo =1;
        int SpaceCount = n-1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=SpaceCount+ColNo;j++){
                if(j<=SpaceCount){
                    System.out.print(" ");
                }
                else{
                    PrintNumAltSpace(j, i,SpaceCount);
                }
            }
            ColNo+=2;
            SpaceCount--;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Number_Pyramid(10);
    }
}
