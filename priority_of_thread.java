import java.lang.*;
class threadpriority extends Thread
{
    private String getPriority;
    public void run(){
        System.out.println("inside the run method");
    }
    public static void main (String[]args){
        threadpriority t1=new threadpriority();
        threadpriority t2=new threadpriority();
        threadpriority t3=new threadpriority();
        t1.setPriority(3);
        t2.setPriority(6);
        t3.setPriority(4);
        System.out.println("t1 priority"+t1.getPriority);        
        System.out.println("t2 priority"+t2.getPriority);
        System.out.println("t3 priority"+t3.getPriority);        
    }
}
