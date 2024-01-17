import java.util.*;
class area_of_cicle_class{
    int r;double p=3.14;
void a(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the radius value");
    r=sc.nextInt();
}
void print(){
    System.out.println("area of the circle is="+(r*r*p));

}
public static void main(String[]args){
area_of_cicle_class aa=new area_of_cicle_class();
aa.a();
aa.print();
}
}
