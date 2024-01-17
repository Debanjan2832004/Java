import java.util.*;
public class leapyear {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a year");
        int a=sc.nextInt();
        if(a%100!=0 ||a%4==0||a%400==0)
        System.out.println("year is leap year ");
        else
        System.out.println("year is not the leapyear");
    }
}
