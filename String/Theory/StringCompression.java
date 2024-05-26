package String.Theory;

public class StringCompression {
    public static void String_Compression(String str){
        StringBuilder sb = new StringBuilder("");
        //int count = 1;
        //int CheckCount = 0;
        // for(int i=0;i<str.length()-1;i++){
        //     if(str.charAt(i) == str.charAt(i+1)){
        //         count ++;
        //     }
        //     else{
        //         CheckCount = 1;
        //     }
        //     if(i+1 == str.length()-1){
        //         CheckCount = 1;
        //     }
        //     if(CheckCount == 1){
        //         sb.append(str.charAt(i));
        //         if(count != 1){
        //             sb.append(count);
        //     }
        //         count= 1;
        //         CheckCount = 0;
        //         if(str.charAt(i) != str.charAt(i+1) & i+1 == str.length()-1){
        //             sb.append(str.charAt(i+1));
        //         }

        //     }
        // }

        // or

        int count = 0;
        for(int i=0;i<str.length();i++){
            count = 1;
            while(i< str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count ++;
                i++;
            }
            sb.append(str.charAt(i));
            if(count != 1){
                sb.append(count);
            }
        }
        System.out.println(sb);

    }
    public static void main(String[] args) {
        String_Compression("abcdddddeeefgghajkh");
    }
}
