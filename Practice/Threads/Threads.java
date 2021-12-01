
//package Threads;

public class Threads extends Thread{

    @Override
    public void run() {

        if(this.isDaemon()){
            System.out.println("Running!");
        }
        else{
            System.out.println("It is a user Thread!");
        }

        
    }



    
}
