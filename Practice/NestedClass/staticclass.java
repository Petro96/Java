public class StaticClass{
    
    static class Inner{
        int a = 5;
        int b = 13;
        public void method(){
            int result = a + b;
            System.out.println("Static Nested Class.");
            System.out.println("Addition "+a+"+"+b+"="+result);
        }
    }
    
    public static void main(String[] args){
        StaticClass.Inner nested = new StaticClass.Inner();
        nested.method();
    }
}