public class SecondThread implements Runnable{
    private int i;
    public void run(){
        for(;i<100;i++){
			System.out.println(Thread.currentThread().getName()+""+i);
        }
    }
    public static void main(String [] args){
        SecondThread st = new SecondThread();
        new Thread(st,"Ïß³Ì1").start();
    }
}