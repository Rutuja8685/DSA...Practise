package Sorting.Sorting;

public class Bubblesort {
    public static int GetSort(int[] arr){
        int count=0;
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                       arr[j+1] =temp;
                }
                count++;
            }
        }
        System.out.println(count+"= count");
        return 0;
    }
    public static void printarray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        GetSort(arr);
        printarray(arr);
    }
    
}
