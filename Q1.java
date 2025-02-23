import java.util.*;
public class Q1 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("How many element");
    int n=sc.nextInt();
    int arr[]=new int[n];
    int max=0;
    int min=0;
    System.out.println("Enter "+n+" Element");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Your array is");
    for(int i=0;i<n;i++){
        System.out.println(arr[i]);
    }
    for(int i=0;i<n;i++){
        if(min>arr[i]){
            min=arr[i];
        }
        if(max<arr[i]){
            max=arr[i];
        }
    }
    System.out.println("Max number : "+max);
    System.out.println("Min number : "+min);
}
}
