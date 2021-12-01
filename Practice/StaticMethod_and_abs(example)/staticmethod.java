public class staticMethod{
    public static void main(String[] args){
        User user1 =  new User("Michael",23);
        user1.getFullName();
        
        User.printUser(user1);
    }
}