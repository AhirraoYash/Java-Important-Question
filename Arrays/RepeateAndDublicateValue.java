import java.util.*;
public class RepeateAndDublicateValue {
    public static void main(String[] args){
        int[] arr={1,2,3,1,5,6};
        CheckIt(arr); 
    }
    static void CheckIt(int[] arr){
        HashSet<Integer> Set=new HashSet<>();
        int repeating=-1,missing=-1;
        for(int num : arr){
            if(Set.contains(num)){
                repeating=num;
            }
            Set.add(num);
        }

        //for missing value
        for(int i=1;i<=arr.length+1;i++){
            if(!Set.contains(i)){
                missing=i;
                break;
            }
        }
        System.out.println("Missing value : "+missing);
        System.out.println("repeate value : "+repeating);
    }
}
