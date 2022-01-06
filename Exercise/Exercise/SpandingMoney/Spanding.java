import java.util.Scanner;

public class Spanding
{

    public void interest(int principalAmount,int interestRate,int years){
        double interest = (principalAmount * interestRate * years)/100;
        System.out.println("interest: "+interest);

    }



	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		// your code goes here
        // spanding money(you can make to calculate with kamata)
		int result = amount;

		for(int i=0;i<12;i++){ // do roka

			result = ((result)-((result*10)/100));
			
		}

		System.out.println(result);
		
	}
}
