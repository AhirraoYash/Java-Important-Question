public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr={4,-2,5,-17,-1,6,7,-19};
        subArray(arr);
    }
    static void subArray(int[] arr){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int start=0;
        int end=0;
        int temStart=0;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            if(maxSum<currSum){
                maxSum=currSum;
                end=i;
                start=temStart;
            }
         
            if(currSum<0){
                currSum=0;
                temStart=i+1;
            }
            
        }
        System.out.println("sum : "+maxSum);
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]);
        }
    }
}
