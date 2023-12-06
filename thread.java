// THREAD IMPLEMENTETION BY EXTENDING Thread CLASS
class b extends Thread {
public void run(){
for (int i=0;i<5;i++){
    System.out.println("Debanjan");
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {}
}
    }
}


 class thread{
    public static void main(String[] args) {
        b tt=new b();
        tt.start();
        for (int i=0;i<5;i++){
    System.out.println("Deb");
    try{
    Thread.sleep(1000);
    }catch(InterruptedException e){}
}
    }
}
