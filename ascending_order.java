import java.util.*;
class ascending_order{
   static int []var=new int[5];
   static int i;
    public static void main(String[]args){
        int []a=new int[5];
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++){
            System.out.println("enter the number");
            a[i]=sc.nextInt();
        }
        //for(int j=0;j<5;j++){
           // System.out.println(a[j]);
        
        for (int k=0;k<a.length;k++){
            if(a[k]<a[k+1]){
                var[k]=a[k];
             //   a[k]=a[k+1];
            }
            }
        for(int l=0;l<var.length;l++){
            System.out.print(var[l]);
        }
        }
    }
