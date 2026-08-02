package Array;

public class Practise1 {
    // public static void getMajority(int[] arr){
    //     int n=arr.length;
    //     int Majority=0;
    //     int A=0;
    //     for(int i=0; i<n;i++){
    //         for(int j=i+1; j<n; j++){
    //             if(arr[i]==arr[j]){
    //                 A++;
    //             }
    //         }
        
    //     if(A>n/2){
    //                 Majority=arr[i];
    //             }}
    //             System.out.println(Majority);
    // }
    
     public static void getMajority(int[] arr){
        int n=arr.length;
        int Majority=0;
        int A=0;
        int i=0;
    
            for(int j=i+1; j<n; j++){
                if(arr[i]==arr[j]){
                    A++;
                }
                i++;
            
        
        if(A>=n/2){
                    Majority=arr[i];
                }}
                System.out.println(Majority);
    }
    public static void main(String[] args) {
        int[] arr={2,2,2,3,1,3,3};
        getMajority(arr);
    }
}
