import java.util.*;
public class KthLargeElement{
    public static void main(String[] args){
        Integer[] arr={5,4,2,8,2};
        System.out.println("Number is present : "+Check(arr,1));
    }
    static int Check(Integer[] arr,int k){
        TreeSet<Integer> Set=new TreeSet<>(Arrays.asList(arr));
        Integer[] aux=Set.toArray(new Integer[0]);
      
         return aux[Set.size()-k];
    }
}