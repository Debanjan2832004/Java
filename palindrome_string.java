import java.util.*;
public class palindrome_string {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your string");
        String str= sc.nextLine();
        String st="";
        char s;
        int vowel_count=0;
        
        for(int i=0;i<str.length();i++){
            s=str.charAt(i);
            st=s+st;
            if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
                System.out.println("vowel is"+s);
                vowel_count=vowel_count+1;
            }
        }
        System.out.println("reverse word is"+st);
         if(str.equals(st)){
            System.out.println("palindrome");
         }
           else{
               System.out.println("not palindrome");
           }
           System.out.println("Total number of vowel are"+vowel_count);

        }
}

