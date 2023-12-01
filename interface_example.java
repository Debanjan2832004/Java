
//1 ST CLASS
class student {
    static String name;
    static  int bengali;
    static int english;
    void EXAM(String n,int b,int e){
         name=n;
         bengali=b;
         english=e;
    }
}
// INTERFACE
interface INTERFACE {
int physicaleducation=97;
void sport();
}
//2 ND CLASS
class result extends student implements INTERFACE{
    void dispaly(){
    System.out.println("bengali is"+bengali);
    System.out.println("english is"+english);
    }
    public void sport(){
        System.out.println("physicaleducation is"+physicaleducation);
    }
}
//main method
public class interface_example {

    public static void main (String[]args){
        result rr= new result();
        rr.EXAM("RAM",92,99);
        rr.dispaly();
        rr.sport();   
    }
}
