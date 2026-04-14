package Array;

import java.util.Arrays;

public class ThirdLargestElement {
    static int getThhirdLargest(int[] arr){

        // length of an array
        int m =arr.length;

        //sorting array
        Arrays.sort(arr);

        //Now finding an element
        for(int i=m-3; i>=0; i--){

            if(arr[i]!=arr[m-2]){
                return(arr[i]);
            }
        }

        return -1;
        }

        public static void main(String[] args) {
            int[] arr={78,66,45,900,45678,87654,34679};

            System.out.println(getThhirdLargest(arr));
        }
}
