package Array;

public class subarray {
    public static void getSubarray(int[] arr){
       for(int i=0; i<arr.length; i++){
        for(int j=i; j<arr.length; j++){
            for(int k=i; k<=j; k++){
            System.out.print(arr[k]+(k==j?"":","));
            }
            System.out.println();
        }
       }

    }
    public static void main(String[] args) {
        int arr[]={2,5,7,9};
        getSubarray(arr);
    }
}
