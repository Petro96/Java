public class Rabbit extends Animal implements Prey {

    @Override
    public void flee(){
        System.out.println("Rabbit flee from predator.");
    }

    @Override             // dynamic override
    public void method(){
        super.method();  // overriding
    }

}
