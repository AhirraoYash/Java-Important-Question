import java.util.*;
class demo{
    public static void main(String[] args){
        int[] arr={1,2,3,1,6,5};
        check(arr,arr.length);
    }
    static void check(int[] arr,int n){
        HashSet Set=new HashSet();
        int repeate=-1,missing=-1;
        int Min=Integer.MAX_VALUE;
        //repeate
        for(int num : arr){
            if(Set.contains(num)){
                repeate=num;
            }
            Set.add(num);
            Min=Integer.min(Min,num);
        }

        //missing
        for(int i=Min;i<Min+n;i++){
            if(!Set.contains(i)){
                missing=i;
            }
        }
        System.out.println("Missing number : "+missing);
        System.out.println("Repeate Number : "+repeate);

    }
}