import java.util.*;

public class omit_specific_char
{
public static void main(String[]args){
    Scanner sc=new Scanner(System.in );
    System.out.println("enter the string");
    String s=sc.nextLine();
    String f ="";
    char demo;
    for (int i=0;i<s.length();i++){
        demo=s.charAt(i);
        if(demo=='t'||demo=='h'||demo=='E'||demo=='T'||demo=='H'||demo=='E'){
            continue ;
        }
        else{
        f=f+demo;
        }
    }
    System.out.println(f);
}
	}

