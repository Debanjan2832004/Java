public class copy_the_array_to_another_array_reverseorder {
    public static void main(String[] args) {
        int []first={1,2,3};
        int[]second={0,0,0};
        int tem=first.length-1;
        for(int i=0;i<first.length;i++){
               second[tem]=first[i];
               tem=tem -1;
        }
        for(int j=0;j<first.length;j++){
            System.out.print (second[j]);
        }
           
          }                                                                             
}
