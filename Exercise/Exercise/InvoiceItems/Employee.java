public class Employee{

    int id;
    String firstName;
    String lastName;
    Account account;
    InvoiceItems invoiceItems;

    public Employee(int id,String firstName,String lastName,Account account,InvoiceItems invoiceItems){

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;

        this.account = account;
        this.invoiceItems = invoiceItems;

    }

    protected int getID(){
        return this.id;
    }

    protected String getFirstName(){
        return this.firstName;
    }

    protected String getLastName(){
        return this.lastName;
    }

    


}