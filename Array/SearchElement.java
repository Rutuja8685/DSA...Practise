package Array;
import java.util.*;

public class SearchElement {
    public static void main(String x[]){
//defining array 
Scanner sc=new Scanner(System.in);

System.out.println("Enter the size of array");
int size= sc.nextInt();



//defining array
int[] Marks=new int[size];
System.out.println("enter array elements");
for(int i=0; i<size; i++){
    Marks[i]=sc.nextInt();
}

 System.out.println("enter the number that you want to search");
int num=sc.nextInt();
    for(int i=0; i<size; i++){
    if(Marks[i]==num){
        System.out.println("index of that search number="+i);
    }

    }
}
}