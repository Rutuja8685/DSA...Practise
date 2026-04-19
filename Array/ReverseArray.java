//Reverse an Array if a given an array [2,3,4,,5,6]
// reverse=[6,5,4,3,2]
package Array;
import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter an array size");
        int size=sc.nextInt();

        int[] arr=new int[size];

        System.out.println("Enter an Array");

        for(int i=0; i<size; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Reverse Array");
        for(int i=size-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
