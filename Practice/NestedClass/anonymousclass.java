abstract class Anonymous{
    public abstract void method();
    public abstract int addition();
}

public class AnonymousClass{
    
    public static void main(String[] args){
        Anonymous anonym = new Anonymous(){ //object Anonymous abstract class
            int a=5;
            int b=7;
            public void method(){
                System.out.println("This is example of Anonymous abstract class.");
            }
            public int addition(){
                //System.out.println("Addition "+a+"+"+b+"="+(a+b)); //void type 
                return a+b;
            }
        };
        anonym.method();
        System.out.println("addition: "+anonym.addition());
    }
}