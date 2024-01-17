
public class reverse_string {
    public static void main(String[] args){
        String str="mom";
        String st="";
        char s;
        
        for(int i=0;i<str.length();i++){
            s=str.charAt(i);
            st=s+st;
        }
        System.out.println("reverse word is"+st);
        
    }
}

