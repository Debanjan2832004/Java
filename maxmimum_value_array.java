import java.util.*;
public class maxmimum_value_array{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int []a=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("enter the umber");
            a[i]=sc.nextInt();
}
int max=a[0];
for (int j=0;j<5;j++){
    if(a[j]>max){
        max=a[j];
    }
}
System.out.println("big is"+max);
    }
}