import java.util.Scanner;
public class FutureInvest{
	public static void main(String[] args){
		/*Scanner userInput = new Scanner(System.in);
		System.out.print("Enter Investment amount: ");
		double investAmount = userInput.nextDouble();
		System.out.print("Enter annual interest rate in percentage: ");
		double interestRate = userInput.nextDouble();
		System.out.print("Enter number of years: ");
		double numYears = userInput.nextDouble();
		//double accValue = userInput.nextDouble();
		double monthlyInterestRate = interestRate/12;
		double futInvestValue = (1 + monthlyInterestRate);
			futInvestValue = futInvestValue * investAmount;
			//futInvestValue = futInvestValue * numYears;
		System.out.printf("Accumulated value: %f", futInvestValue);
		/*futInvestValue = (1 + monthlyInterestRate) * (1 + monthlyInterestRate);
		futInvestValue = (1 + monthlyInterestRate) * futInvestValue;
		futInvestValue = (1 + monthlyInterestRate) * futInvestValue;
		futInvestValue = (1 + monthlyInterestRate) * futInvestValue;
		futInvestValue = (1 + monthlyInterestRate) * futInvestValue;
		futInvestValue = (1 + monthlyInterestRate) * futInvestValue;
		futInvestValue *= investAmount;
		System.out.printf("Accumulated value: %f", futInvestValue);*/
		double investmentAmount;
		double annualInterestRate;
		double numberOfYears;
		double futureInvestmentValue;
        	Scanner userInput = new Scanner(System.in);
        	System.out.print("Enter investment amount: ");
        	investmentAmount = userInput.nextDouble();
        	System.out.print("Enter annual interest rate in percentage: ");
        	annualInterestRate = userInput.nextDouble();
        	System.out.print("Enter number of years: ");
        	numberOfYears = userInput.nextDouble();
        	annualInterestRate = annualInterestRate / 100;
        	futureInvestmentValue = investmentAmount * (1 + annualInterestRate) * (numberOfYears);
        	System.out.printf("Accumulated value: %.0f%n", futureInvestmentValue);
        }

}
