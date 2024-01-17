import java.util.*;
class area_of_rectangle_class{
    int a,b;
void print(int a,int b){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the length of the rectangle");
    a=sc.nextInt();
    System.out.println("enter the width of the rectangle");
    b=sc.nextInt();
    System.out.println("area of a rectangle is"+(a*b));
}
public static void main(String[]args){
area_of_rectangle_class aa=new area_of_rectangle_class();
aa.print(5,7);
}
}
