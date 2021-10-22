public class Fish extends Animal implements Prey,Predator {
    
    @Override
    public void flee(){

        System.out.println("This fish flee from predator.");
    }

    @Override
    public void hunt(){

        System.out.println("Fish hunting.");
    }

    @Override
    public void method(){
        super.method();
    }


}
