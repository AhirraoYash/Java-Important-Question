import java.util.*;
public class ContainDuplicate {
    public static void main(String[] args){
        int[] arr={1,2,3,2,5,1}; 
        findDuplicate(arr);
        findDuplicate2(arr);
    }
    static void  findDuplicate(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int n=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[n]==arr[j]){
                    System.out.println("Duplicate element found in index : "+(j
                    ));
                }
            }
        }
    }

    static void findDuplicate2(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
               System.out.println("Duplicate Element found in index of : "+i); 
            }
            else{
                set.add(arr[i]);
            }
        }
         
    }
}
