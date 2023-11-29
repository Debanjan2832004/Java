import java.util.*;
public class primenumber {
    public static void main(String[]args){
        int i,j,k=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the low");
        i=sc.nextInt();
        System.out.println("enter the high");
        j=sc.nextInt();
        while(i<=j){
            int d=1;
            int count=0;
            while(d<=i){
                if(i%d==0){
                    count=count+1;
                }
            d=d+1;
            }
             if(count==2){
                System.out.println(i);
                 k=k+1;
                 if(k==10)
                 break;     
             }
            i=i+1;
}
    }
}