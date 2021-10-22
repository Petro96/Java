public class Main{

        //example of use inteface,dynamic overriding, Inheritance

    public static void main(String[] args){

        Rabbit rabbit = new Rabbit();
        rabbit.method();
        rabbit.flee();
        

        Hawk hawk = new Hawk();
        hawk.method();
        hawk.hunt();
        

        Fish fish = new Fish();
        fish.method();
        fish.flee();
        fish.hunt();

        Zebra zebra = new Zebra();
        zebra.method();
        zebra.flee();


    }

}