public class Account {
    
    int id;
    String name;
    int balance = 0;

    public Account(int id,String name,int balance){

        this.id = id;
        this.name = name;
        this.balance = balance;

    }

    protected int getID(){
        return this.id;
    }

    protected String getName(){
        return this.name;
    }

    protected int getBalance(){
        return this.balance;
    }

    protected int credit(int amountOfCredit){
        this.balance+=amountOfCredit;
        return balance;
    }

    protected int debit(int amountOfDebit){

        if (amountOfDebit <= this.balance){
            this.balance-=amountOfDebit;
        }else{
            System.out.println("Amount exceeded");
        }
        return this.balance;

    }

    protected int transferTo(Account account, int amountForTransfer){
        if (amountForTransfer <= account.balance){
            System.out.println("Can be transfered!");
        }else{
            System.out.println("Amount exceeded!");
        }
        return this.balance;        
    }

    public String toString(){
        return "Account id: "+this.id+" Name: "+this.name+" Balance: "+this.balance;    
    }



}
