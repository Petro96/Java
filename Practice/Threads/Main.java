

// doing multiple things at the same time !! 
// like virtual processor
//User, Demon threads


// Daemon - low priority perform tasks like garbage collections


//package Threads;

public class Main  {

    public static void main(String[] args) throws InterruptedException{  // throws - exceptions

    //System.out.println(Thread.activeCount()); // main tread running

    //Thread.currentThread().setName("My Main Thread"); //change name of current thread
    //System.out.println(Thread.currentThread().getName()); // main thread

    //Thread.currentThread().setPriority(10);
    //System.out.println(Thread.currentThread().getPriority()); // priority (10 - highest)

    System.out.println(Thread.currentThread().isAlive());

    // for(int i=3;i>0;i--){
    //     System.out.println(i);
    //     Thread.sleep(1500);
    // }

    Threads thread  = new Threads();

    thread.setDaemon(true);
    System.out.println(thread.isDaemon());

    thread.start();

    System.out.println(thread.isAlive());
    System.out.println(thread.getName()); // Thread-0  .setName()
    System.out.println(thread.getPriority());

    System.out.println(Thread.activeCount());

    
    

    }

    // public void run() {
    //     System.out.println("Im in Thread.");
    // }

    
}
