// package Java-Important-Question;
import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many Element");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Your array is");
        for (int i = 0; i < n; i++) {
             arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){ 
                   System.out.print(arr[k]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
         
    }
}
