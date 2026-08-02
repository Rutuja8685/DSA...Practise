package Sorting.Sorting;
public class Bubble_Practise {
    public static void GetSort(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    }
    public static void Selection(int[] arr){
    int n = arr.length;
    
    // Outer loop moves the boundary of the unsorted subarray
    for(int i = 0; i < n - 1; i++){
        // Assume the first element of the unsorted part is the minimum
        int minIndex = i; 
        
        // Inner loop finds the actual minimum element in the remaining unsorted array
        for(int j = i + 1; j < n; j++ ){
            if(arr[j] < arr[minIndex]){
                minIndex = j; // Update the index of the minimum element
            }
        }
        
        // Swap the found minimum element with the first element of the unsorted part
        int temp = arr[minIndex];
        arr[minIndex] = arr[i];
        arr[i] = temp;
    }
}

public static void main(String[] args) {
    int[] arr = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
    Selection(arr);
    for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " "); // Changed to print on one line for readability
    }
}
}