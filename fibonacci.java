import java.util.*;
public class fibonacci{
 
    public static void main(String[]srgs){
    int x=0;
    int y=1;
    int z=0;
    int a;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the max number");
         a=sc.nextInt();
        while(z<=a){
            System.out.println(z);
            x=y;
            y=z;
            z=x+y;
        }
    }
}