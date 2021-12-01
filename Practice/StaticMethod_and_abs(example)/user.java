public class User{
    private String name;
    private int age;
    
    User(String name,int age){
        this.name = name;
        this.age = age;
    }
    
    public String getFullName(){
        return "Name: "+this.name+"\nAge: "+this.age ;
    }
    
    public static void printUser(User user){
        System.out.println(user.getFullName()); // method inside must return String !!!!
    }
    
    
}