package Arrays.Theory;

public class StockProfit {
    public static double MaxProfit(int arr[]){
        double CurrPrice = arr[0];
        double MaxProfit = Integer.MIN_VALUE;
        double profit = 0;

        for(int i=0;i<arr.length-1;i++){
            
            if(CurrPrice>=arr[i+1]){
                CurrPrice = arr[i+1];
            }
            else{
                profit = arr[i+1] - CurrPrice;
                MaxProfit = Math.max(MaxProfit,profit);
            }

        }
        return MaxProfit;
    }
    public static void main(String[] args) {
        int arr[] = {7,6,5,2,6,9};
        System.out.println(MaxProfit(arr));
    }
}
