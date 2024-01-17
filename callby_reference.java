public class callby_reference{
   static void fun(int[]a){
           int t=a[0];
           a[0]=a[1];
           a[1]=t;
       }
       public static void main(String[]args){
           int a[]={10,20};
           fun(a);
           
           
           
           for (int i=0;i<2;i++){
               System.out.print(a[i]);
           }
           
       }
   }