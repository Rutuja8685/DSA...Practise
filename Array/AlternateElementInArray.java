package Array;
import java.util.*;

class A{
static void Alternate(int[] arr){
    int n=arr.length;
    for(int i=0; i<=n; i++){
    if(i%2==0){
        System.out.println(arr[i]);
    }
}
}
}
public class AlternateElementInArray {
    public static void main(String[] args) {
        int[] arr={8,7,6,5,4,3,2,77};
        A a=new A();

        a.Alternate(arr);

        for(int i=0; i<=arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
