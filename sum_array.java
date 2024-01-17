import java.util.*;
public class sum_array {
    public static void main(String[]args){
        int a[]=new int[5];
        int i,s=0;
        System.out.println("enter 5 array value");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++){
            a[i]=sc.nextInt();
            s=s+a[i];
        } 
        System.out.println("sum of array is"+s);

    }   
}
