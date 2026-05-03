package Array;

public class LinearSearchex {
    public static int linearsearch(int numbers[],int key){

        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==key){
                System.out.println("key is at inedex"+i);
            }
         
        else{
                System.out.println("not found");
                 return 0;
            }   
         
    }
        return key;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        int key=1;

        linearsearch(numbers, key);
    }
}
