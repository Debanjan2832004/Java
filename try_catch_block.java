public class try_catch_block {
    public static void main(String[] args) {
        int a=5,b=0,c;
        System.out.println("starting point");
        try{
                c=a/b; 
                System.out.println("division value is"+c);
        }
        catch(Exception e){
            System.out.println(e);
        }
         System.out.println("ending point");
    }
}
