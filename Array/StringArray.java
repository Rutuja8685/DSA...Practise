package Array;
import java.util.*;
public class StringArray {
    public static void main(String[] args) {
        

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size");
       int size=sc.nextInt();
        //definig array
        String[] Name=new String[size];

        System.out.println("Enter the elements in an array");
        for(int i=0; i<size; i++){
            Name[i]=sc.next();
        }

        for(int i=0; i<size; i++){
            System.out.println(Name[i]);
        }
    }

}
