package String.Theory;

public class Palindrome {
    public static boolean IsPalindrome(String str){
        // String PalindromeStr = "";
        // for(int i=str.length()-1;i>=0;i--){
        //     PalindromeStr = PalindromeStr + str.charAt(i);
        // }

        // if(str.equals(PalindromeStr)){
        //     return true;
        // }

        // or

        for(int i=0;i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(IsPalindrome("racecar"));
    }
}
