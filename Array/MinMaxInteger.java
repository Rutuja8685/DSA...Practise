//Take input of an array and find the Min and max element


package Array;
import java.util.*;
public class MinMaxInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //size
        System.out.println("enter size of array");
        int size=sc.nextInt();

        int[] Marks=new int[size];
        System.out.println("enter the elements of array");
        for(int i=0;i<Marks.length; i++){
            Marks[i]=sc.nextInt();
        }

        //defining min and max
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<Marks.length; i++){
            if(Marks[i]<min){
                min=Marks[i];
            }
            if(Marks[i]>max){
                max=Marks[i];
            }
        }
        System.out.println("max value="+max);
        System.out.println("min value="+min);

    }
}
