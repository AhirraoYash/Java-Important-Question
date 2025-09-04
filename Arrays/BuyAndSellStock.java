class BuyAndSellStock{
    public static void main(String[] args){
        int[] arr={7,3,1,2,6,3,9};
        BuyingDay(arr);
    }
    static void BuyingDay(int[] arr){
        int maxProfit=Integer.MIN_VALUE;
        int BuyingDay=0;
        int SellingDay=1;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){ 
                int currProfit = arr[j]-arr[i];
                if(maxProfit<currProfit){ 
                    maxProfit=currProfit;
                    BuyingDay=i;
                    SellingDay=j;
                }
            }
        }   
        }
        System.out.println("Max Profit : "+maxProfit);
        System.out.println("Buying day : "+BuyingDay+" sellingDay : "+SellingDay);
    }
}