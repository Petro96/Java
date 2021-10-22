class Outer{
    
    String s = "Hey People";
    int number = 13;
    
    private class Inner{
        public void print(){
            System.out.println(s+" how are you?This is the example of nested inner class.");
            System.out.println("Inner class variable: "+number);
        }
    }
    void method(){ //method that i call in public static for accesing the inner class.
        Inner in = new Inner();
        in.print();
    }
}

public class InnerClass{
    public static void main(String[] args){
        Outer out = new Outer();
        out.method();
    }
}