import java.util.Scanner;
public class CalInterest{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter balance and interest rates: ");
		double balance = userInput.nextDouble();
		double annualInterestRate = userInput.nextDouble();
		double interest = balance * (annualInterestRate/1200);
		System.out.printf("The interest is: %.5f%n", interest);
		// Test zone 
		System.out.printf("****%n ******%n*******%n ******%n ****%n");
		
		System.out.println("*");
		System.out.println("***");
		System.out.println("*****");
		System.out.println("****");
		System.out.println("**");
		System.out.println("\n\n");
		System.out.print("*");
		System.out.print("***");
		System.out.print("*****");
		System.out.print("****");
		System.out.println("**");
		
		System.out.println("\n\n");
		//What does the following code print?
		System.out.print("*");
		System.out.println("***");
		System.out.println("*****");
		System.out.print("****");
		System.out.println("**");
		System.out.println("\n\n");
		System.out.printf("%s%n%s%n%s%n%s%n", " *", " ***", "*****", " ***", "  *");
	}
}
