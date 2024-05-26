package String.Theory;

public class ShortestPath {
    public static double FindShortest_Path(String str){
        int y = 0;
        int x = 0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == 'N'){
                y+=1;
            }
            if(str.charAt(i) == 'S'){
                y-=1;
            }
            if(str.charAt(i) == 'E'){
                x+=1;
            }
            if(str.charAt(i) == 'W'){
                x-=1;
            }
        }
        double ShortestPath = Math.sqrt((Math.pow(y, 2) + Math.pow(x, 2)));
        return ShortestPath;
    }
    public static void main(String[] args) {
        System.out.println(FindShortest_Path("WNEENESENNN"));
    }
}
