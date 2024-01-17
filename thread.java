// THREAD IMPLEMENTETION BY EXTENDING Thread CLASS
class b extends Thread {
public void run(){
for (int i=0;i<101;i++){
    System.out.println("Debanjan");
    try {
        Thread.sleep(100000);
    } catch (InterruptedException e) {}
    int n=0;
    while (n<5) {
        System.out.println("hello world");
        n++;
    }
}
    }
}


 class thread{
    public static void main(String[] args) {
        b tt=new b();
        //tt.start();
        tt.start();
         b tt1=new b();
        //tt.start();
        tt1.start();
        for (int i=0;i<5;i++){
    System.out.println("Deb");
    try{
    Thread.sleep(1000);
    }catch(InterruptedException e){}
}
    }
}
