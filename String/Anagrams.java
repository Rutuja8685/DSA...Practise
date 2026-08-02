package String;

public class Anagrams {
    public static String getAnagrams(String str,String str1){
        for(int i=0; i<str.length(); i++){
            char c=str1.charAt(i);
            if(str.contains(String.valueOf(c))){
                System.out.println("anagrams");
            }
            else{
                System.out.println("strings are not anagrams");
            }
            i++;
        }
        return str1;

    }
    public static void main(String[] args) {
        String str="race"; 
        String str1="qwer";
        getAnagrams(str, str1);
    }
}
