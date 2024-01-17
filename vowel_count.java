import java.util.*;
public class vowel_count
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        int co=0;
	    System.out.println("enter the string");
	    String s=sc.nextLine();
	    for(int i=0;i<s.length();i++){
	        char c=s.charAt(i);
	        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
	            co++;
	        }
	    }
	             System.out.println("total vowel is"+co);

	}
}

