// THREAD IMPLEMENTETION BY USING runnable Interface
class A implements Runnable{
public void run(){
for (int i=0;i<5;i++){
    System.out.println("Debanjan");
    }
}
}


public class runnable_interface {
    public static void main(String[]args){
        A aa=new A();
        Thread tt=new Thread(aa);
        tt.start();
    for (int i=0;i<5;i++){
    System.out.println("Deb");
    }

    }
}
