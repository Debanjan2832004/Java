import java.util.*;
public class switch_case {
    public static void main(String[]args){
        int a,b,ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        a=sc.nextInt();
        System.out.println("enter the second number");
        b=sc.nextInt();
        System.out.println("enter 1 for aaddition 2 for subtraction");
        ch=sc.nextInt();
        switch(ch){
            case 1:
            System.out.println("addition="+(a+b));
            break;
            case 2:
            System.out.println("subtraction="+(a-b));
        }
    }
}
