public abstract class People { //can be abstract class People --> abs methods can not be initated

    private String name;
    private String lastName;
    private int age;
    private String email; //private special
    //public int number = 13; // its public -> can access with every class
    static int numberOfPeople=0;

    People(String name,String lastName,int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.email= name+lastName+"@gmail.com";
        numberOfPeople++;
    }

    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public String getEmail(){
        return this.email;
    }


}

