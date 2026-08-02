package Array;

public class LeftRotateByOne {
   public static void getarray(int[] arr){
    int temp=arr[0];
    int n=arr.length;
    for(int i=0;i<n;i++){
        arr[i]=arr[i-1];
    }
    arr[n-1]=temp;
    System.out.println(arr);
} 
public static void main(String[] args) {
    int arr[]={1,2,3,4,5};
     getarray(arr);
}
}
