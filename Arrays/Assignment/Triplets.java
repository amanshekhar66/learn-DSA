package Arrays.Assignment;
import java.util.*;

public class Triplets {
     public static int TripletNo = 0;
     public static int TripletArr[] = new int[100];
     public static int PrintCount = 0;
     public static  int count = 0;

     public static void PrintTriplet(int FirstEl, int SecondEl, int ThirdEl){

        int TripletSubArr[] = new int[3];
        boolean DuplicateTriplet = false;
        int InitialCount;
        
        if(TripletNo!=0){
            TripletSubArr[0] = FirstEl;
            TripletSubArr[1] = SecondEl;
            TripletSubArr[2] = ThirdEl;
            Arrays.sort(TripletSubArr);
        }
 
        if(TripletNo==0){
            InitialCount = count;
            DuplicateTriplet = false;
            TripletArr[count++] = FirstEl;
            TripletArr[count++] = SecondEl;
            TripletArr[count++] = ThirdEl;
            Arrays.sort(TripletArr,InitialCount,count);
            TripletNo++;
            System.out.print("("+TripletArr[0]+","+TripletArr[1]+","+TripletArr[2]+")");
            System.out.println();
        }
        else{
            for(int i=0;i<count;i+=3){
                if(TripletArr[i]==TripletSubArr[0] & TripletArr[i+1]== TripletSubArr[1] & TripletArr[i+2] == TripletSubArr[2]){  
                    DuplicateTriplet = true;
                }
            }
            if(!DuplicateTriplet){
                InitialCount = count;
                TripletArr[count++] = FirstEl;
                TripletArr[count++] = SecondEl;
                TripletArr[count++] = ThirdEl;
                Arrays.sort(TripletArr,InitialCount,count);
                PrintCount+=3;
                
                for(int j=PrintCount;j<=PrintCount+2;j++){
                    if(j==PrintCount){
                        System.out.print("(");
                    }
                    if(j!=PrintCount+2){
                        System.out.print(TripletArr[j]+",");
                    }
                    else{
                        System.out.print(TripletArr[j]+")");
                        System.out.println();
                    }
                }
            }
        }
    }

    public static void GetTriplets(int arr[]) {
       
        // Loop through the array to pick the first element of the triplet
        for (int i = 0; i < arr.length - 2; i++) {
            // Loop through the remaining elements to pick the second element of the triplet
            for (int j = i + 1; j < arr.length - 1; j++) {
                // Loop through the remaining elements to pick the third element of the triplet
                for (int k = j + 1; k < arr.length; k++) {
                    //System.out.println("(" + arr[i] + ", " + arr[j] + ", " + arr[k] + ")");
 
                    if(i != j & j != k & k != i & (arr[i]+arr[j]+arr[k]) == 0){
                        PrintTriplet(arr[i],arr[j], arr[k]);
                    }  
                }
            }
        }
    }
        public static void main(String[] args) {
        int arr[] = {-1,0,1,2,-1,-4,3,-2};
        GetTriplets(arr);
    }
}
