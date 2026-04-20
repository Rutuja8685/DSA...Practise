//Reverse an Array if a given an array [2,3,4,,5,6]
// reverse=[6,5,4,3,2]
// use this technique to print the reversed array
// package Array;
// import java.util.*;
// public class ReverseArray {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter an array size");
//         int size=sc.nextInt();

//         int[] arr=new int[size];

//         System.out.println("Enter an Array");

//         for(int i=0; i<size; i++){
//             arr[i]=sc.nextInt();
//         }

//         System.out.println("Reverse Array");
//         for(int i=size-1; i>=0; i--){
//             System.out.println(arr[i]);
//         }
//     }
// }

package Array;
 import java.util.*;
 public class ReverseArray {

    public void reversearray(int[] arr){
        int n=arr.length;
        for(int i=0; i<n/2; i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={5,8,2,6,9,0,4};

        ReverseArray s=new ReverseArray();
        s.reversearray(arr);
    
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
 }