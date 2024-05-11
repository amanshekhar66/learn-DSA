package Pattern;

public class PalindromicPattern {
    public static void Palindromic_Pattern(int n){
        int SpaceCount = n-1;
        int ColNo=1;
        boolean incr = false;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=SpaceCount+ColNo;j++){
                if(j<=SpaceCount){
                    System.out.print(" ");
                }
                else if(j==SpaceCount+1){
                    System.out.print(i);
                }
                else{
                    if(i!=1 & !incr){
                        System.out.print(--i);
                    }
                    else{
                        System.out.print(++i);
                        incr=true;
                    }
                }
            }
            SpaceCount--;
            ColNo+=2;
            incr=false;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Palindromic_Pattern(6);
    }
}