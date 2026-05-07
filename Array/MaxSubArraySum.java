package Array;

public class MaxSubArraySum {
    public static void Printsubarray(int arr[]){
         int max=Integer.MIN_VALUE;
         int add=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                add=0;
                for(int k=i; k<=j; k++){
                    // System.out.println(arr[k]);  
                    add+=arr[k];
                }
                 System.out.println(add);
                if(max <add){
                    max=add;
                }
            }   
           
            
            }
            System.out.println("max value = "+max);
            System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={6,7,8,9,7};
        Printsubarray(arr);
}
}
