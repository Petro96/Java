// Declaration,Instantation,Initialization

public class Puppy {

        int puppyAge; //instance variable , declaration
        int counter=0;

        public Puppy(String name,String rasa) { // define (object) constructor //instantiation(creating object)
           // This constructor has one parameter, name.
           System.out.println("Passed Name is :" + name + " Rasa psa: " + rasa);
           counter+=1;
        }

        public void setAge(int age){
            puppyAge = age;
        }

        public int getAge(){
           System.out.println("Puppys age:"+puppyAge);
           return puppyAge;
        }
     
        public static void main(String []args) {
           // Following statement would create an object myPuppy
           Puppy myPuppy = new Puppy( "tommy" ,"Labrador"); //initialization
           //myPuppy.Puppy("Jack");  // error, method is not define ? 
           myPuppy.setAge(5);
           myPuppy.getAge();
           System.out.println("Puppys age from println:"+myPuppy.puppyAge);
           System.out.println("How many dogs you have: "+myPuppy.counter);
        }
     
}
