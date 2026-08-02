package String;

import java.util.Scanner;

public class CountLowercase {
    public static String getlowercase(String str){
        int cout=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
                cout++;
            }
        }
        System.out.println(cout);
        return str;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        getlowercase(str);
     }
}
