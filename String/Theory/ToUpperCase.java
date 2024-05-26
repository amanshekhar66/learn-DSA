package String.Theory;

public class ToUpperCase {
    public static void ConvertFirstLetter_ToUpperCase(String sb){
        
        StringBuilder str = new StringBuilder(sb);
        for(int i=0;i<str.length();i++){
            if(i == 0){
                Character ch = Character.toUpperCase(str.charAt(i));
                str.replace(i,i+1,ch.toString());
            }
            if(str.charAt(i) == ' '){
                Character ch = Character.toUpperCase(str.charAt(i+1));
                str.replace(i+1,i+2,ch.toString());
            }
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        String str = new String("    hi, i am aman shekhar    ");
        ConvertFirstLetter_ToUpperCase(str.trim());
       
    }
}
