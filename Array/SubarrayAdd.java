package Array;

public class SubarrayAdd {
    static int toal=0;
    static int add;
    static int min=Integer.MAX_VALUE;
    public static void Printsubarray(int arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.println(arr[k]);  
                    add=arr[k]+add;
                }
                System.out.println("total addition = "+add);
                System.out.println();
                toal= add;
                add=0;
                if(toal > min){
                    min=toal;
                }
            }   
            System.out.println("max value = "+toal);
            System.out.println();
            }
    }
    public static void main(String[] args) {
        int arr[]={6,7,8,9,7};
        Printsubarray(arr);
}
}
