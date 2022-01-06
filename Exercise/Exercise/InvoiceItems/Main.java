public class Main{

    public static void main(String[] args){
        System.out.println("Hello");

        Account a = new Account(1234,"RTP-Bank",1200);

        System.out.println("Balance : "+a.getBalance());
        System.out.println("Debit, balance after: "+a.debit(500));

        a.transferTo(a, 700); // because i have 700$ on my account

    }

    
}