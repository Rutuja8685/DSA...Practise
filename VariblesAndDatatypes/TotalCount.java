package VariblesAndDatatypes;

import java.util.Scanner;

public class TotalCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pencil=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();
    
        float Total=(pencil+pen+eraser)*5/100;
        System.out.println(Total);

        // adding tax
        float newTotal=Total +(Total*0.18f);
        System.out.println("final tax price"+newTotal);
    }
}
