package Function;
import java.util.*;

public class Average {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
         
        int A= sc.nextInt();
        int B= sc.nextInt();
        int C= sc.nextInt();

        int Averages=(A+B+C)/3;

        System.out.println("Averages of 3 number "+Averages);
    }
}
