package Array;

public class BinarySearch {
    public static int Getelement(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while (start <= end) {
            // Recalculate mid inside the loop
            int mid = start + (end - start) / 2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]<key){
                 end=mid-1;
            }else{
                 start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String x[]){
        int arr[]={1,3,4,6,8,10,12};
        int key=12;
        int result=Getelement(arr, key);
        if(result==-1){
            System.out.println("Not Found");
        }else{
            System.out.println("index found at = "+ result);
        }
    }
}
