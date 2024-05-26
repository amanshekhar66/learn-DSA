package String.Assignment;
import java.util.*;

public class Anagrams {
    public static boolean CheckAnagrams(String str1, String str2){
        char a1[] = str1.toCharArray();
        char a2[] = str2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1, a2)){
            return true;
        }
        return false;
    }

public static void main(String[] args) {
    System.out.println(CheckAnagrams("race", "carr"));
}
}
