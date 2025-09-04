import java.util.*;
public class ChocalateDistrubutionProblem {
    public static void main(String[] args){
        int[] arr={7, 3, 2, 4, 9, 12, 56};
        System.out.println("Different is : "+different(arr,arr.length,3));
    }
    static int different(int[] arr,int n,int m){
        if(n==0 || m==0){
            return 0;
        }
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            int newDiff=arr[i+m-1]-arr[i];
                if(newDiff<minDiff){
                    minDiff=newDiff;
                }
        }
        return minDiff;
    }
}

// import java.util.Arrays;

// class demo{
//     public static void main(String[] args) {
//         int[] arr={2,3,5,7,2};
//         int n=3;
//         ChocalateProblem(arr, n);
//     }
//     static void ChocalateProblem(int[] arr,int n){
//         int minDiff=Integer.MAX_VALUE;
//         int l=arr.length;
//         int start=0;
//         Arrays.sort(arr);
//         for(int i=0;i<(l-n-1);i++){
//            int currDiff=arr[i+n-1]-arr[i];
//             if(currDiff<minDiff){
//                 start=i;
//                 minDiff=currDiff;
//             }
//         }
//         for(int i=start;i<start+n;i++){
//             System.out.println(arr[i]);
//         }
//     }
//  }
