
// package Java-Important-Question;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Element");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Your array is");
        for (int i = 0; i < n; i++) {
             arr[i]=sc.nextInt();
        }
        int l=arr.length;
        for(int i=l-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
}
