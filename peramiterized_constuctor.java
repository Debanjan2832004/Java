import java.util.*;
public class perametarized_c {
    perametarized_c (int a,int b){
    System.out.println("addition of two numbers is"+(a+b));
    }
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the first number");
    int a=sc.nextInt();
    System.out.println("enter the first number");
    int b=sc.nextInt();

perametarized_c pp=new perametarized_c(a, b);
}
}
