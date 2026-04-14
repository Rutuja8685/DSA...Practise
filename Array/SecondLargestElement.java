package Array;

import java.sql.Array;
import java.util.Arrays;

class SecondLargestElement {
    static int  getSecondLargest(int[] arr){

        //array length
        int n=arr.length;

        //Sorting an array
        Arrays.sort(arr);
        
        // to find a second largest element
        for(int i=n-2; i>=0; i++){
            if(arr[i]!=arr[n-1]){
                return(arr[i]);
            }
        }
        return -1;
}

public static void main(String[] args) {
    
     int[] arr={2,3,7,5};

     
     
     System.out.println(getSecondLargest(arr));
}
}
