public class Zebra extends Animal implements Prey { // can not use extends on interface !!!!!!

    @Override
    public void flee(){

        System.out.println("This Zebra flee from predator.");
    }

    @Override
    public void method(){
        super.method();
    }
    
}
