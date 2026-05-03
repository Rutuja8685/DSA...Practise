package Array;
import java.util.*;
public class LargestNumber {
    public static int Findlargenumber(int arr[]){
        int Max=Integer.MIN_VALUE;

        for(int i = 0; i< arr.length; i++){ 
            if(arr[i]>Max){
                Max = arr[i];
            }
}
        
        return Max;
}
        
          

    public static void main(final String args[]){
        int arr[]={4,67,3,4};
       Findlargenumber(arr);
       System.out.println(Findlargenumber(arr));
}
}