interface Message{
    String method();
}

public class AnonymousInterface{
    public void callMessage(Message m){
        System.out.println(m.method()+"Exmaple of anonymous inner class as argument.");
    }
    
    public static void main(String[] args){
        AnonymousInterface a = new AnonymousInterface();
        
        a.callMessage(new Message(){
            public String method(){
                return "Hello good People!";
            }
        });
    }
}