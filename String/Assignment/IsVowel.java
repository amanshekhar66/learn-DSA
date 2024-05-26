package String.Assignment;

public class IsVowel {
    public static int LowecaseVowels_Count(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='b' || ch=='c' || ch=='d' || ch=='e'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(LowecaseVowels_Count("amanshekhar"));
        String str = "ApnaCollege".replace("Apna","");
        System.out.println(str);
    }
}
