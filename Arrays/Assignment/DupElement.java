
package Arrays.Assignment;
import java.util.*;

public class DupElement {
    public static boolean DuplicateElement_Array(int arr[]){
        int equals = 0;
        boolean duplicate = false;

        for(int i=0;i<arr.length;i++){
            equals = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    equals++;
                }
            }
            if(equals == 2){
                duplicate = true;
                break;
            }
        }
        if(duplicate){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        Arrays.sort(arr);
        System.out.println(DuplicateElement_Array(arr));
    }
}

