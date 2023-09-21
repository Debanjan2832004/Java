import java.util.*;
public class calculator {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        System.out.println("addition value is"+(a+b));
        System.out.println("subtraction value is"+(a-b));
        System.out.println("multiplication value is"+(a*b));
        System.out.println("division value is"+(a/b));
        System.out.println("modulo value is"+(a%b));
    }
}
