import java.util.*;
public class minimum_value_of_array {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int []a=new int[5];
        for (int i=0;i<5;i++){
            System.out.println("enter the number");
            a[i]=sc.nextInt();
        }
        int small=a[0];
        for (int j=0;j<5;j++){
            if (small<=a[j]){
                System.out.println("");
            }
            else{
                small=a[j];
            }
        }
   System.out.println("Smallest value of the array is"+small);
    }
}
