import java.util.*;

public class MaxMin {
    public static void main(String[] args){
        int[] arr={1,2,3,5,6};

        System.out.println("Min value : "+minValue(arr));
        System.out.println("Max value : "+maxValue(arr));
    }
    static int maxValue(int[] arr){
        
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
              
             if(arr[i]>max){
                max=arr[i];
             }
        }
        return max;
    }

    static int minValue(int[] arr){
         
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
              
             if(arr[i]<min){
                min=arr[i];
             }
        }
        return min; 
    }
    static void findMinMax(int[] arr){
        System.out.println(Arrays.stream(arr).min().getAsInt());
        System.out.println(Arrays.stream(arr).max().getAsInt());
    }
}
