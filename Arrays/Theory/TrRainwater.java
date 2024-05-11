package Arrays.Theory;

public class TrRainwater {
    public static int TrappedRainwater(int arr[]){
        int leftarr[] = new int[arr.length];
        int rightarr[] = new int[arr.length];
        int WaterLevel = 0;
        int TrappedWater = 0;

        leftarr[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            leftarr[i] = Math.max(leftarr[i-1], arr[i]);
        }

        rightarr[arr.length-1] = arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightarr[i] = Math.max(rightarr[i+1], arr[i]);
        }

        for(int i=0;i<arr.length;i++){
            WaterLevel = Math.min(leftarr[i], rightarr[i]);
            TrappedWater+=WaterLevel - arr[i];
        }

        return TrappedWater;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
        System.out.println(TrappedRainwater(arr));
    }
}
