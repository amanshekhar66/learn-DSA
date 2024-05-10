package Pattern;

public class HalfCharacter {
    public static void Half_Character(int n, char ch){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Half_Character(4,'A');
    }
}
