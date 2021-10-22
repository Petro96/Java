public class MethodLocalClass{
    
    void Method(){
        int a = 4;
        int b = 5;
        
        class MethodInner{
            public int multi(){
                return a*b;
            }
        }
        
        MethodInner i = new MethodInner();
        System.out.println("Multiplication: "+a+"*"+b+"="+i.multi());
    }
    
    public static void main(String[] args){
        MethodLocalClass o = new MethodLocalClass(); 
        o.Method();
    }
}