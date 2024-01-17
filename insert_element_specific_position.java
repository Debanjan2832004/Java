import java.util.*;
public class insert_element_specific_position{
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int s=sc.nextInt();
        System.out.println("enter the number that you want to place");
        int b=sc.nextInt();
        System.out.println("enter the specific position");
        int c=sc.nextInt();
        int a[]=new int[s];
        for (int i=0;i<s;i++){
            System.out.println("enter the values");
            a[i]=sc.nextInt();
        }
        for (int i=0;i<s;i++){
            System.out.println (a[i]);
        }
        a[c]=b;
        for (int i=0;i<s;i++)
            System.out.print(a[i]+":");
    

    }
}