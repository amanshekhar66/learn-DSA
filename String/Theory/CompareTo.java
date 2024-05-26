package String.Theory;

public class CompareTo {
    public static void LargestString(String str1, String str2){
        if(str1.compareTo(str2) == 0){
            System.out.println("Strings are equal");
        }
        else if(str1.compareTo(str2) > 0){
            System.out.println(str1);
        }
        else{
            System.out.println(str2);
        }
        // a3 and a2 refers to the same obj and so the same address
        String a1 = new String("Tony");
        String a3 = "Tony";
        String a2 = "Tony";
        System.out.println(a1 == a2);
        System.out.println(a3 == a2);

        //StringBuilders are mutable in java
        StringBuilder sb = new StringBuilder("");
        for(char ch = 'a'; ch<='z'; ch++){
            sb = sb.append(ch);
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        LargestString("apple", "banana");
    }
}
