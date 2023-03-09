import java.util.Scanner;
public   class DrivingCost{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the driving distance: ");
		double distance = userInput.nextInt();
		System.out.println("Enter miles per gallon: ");
		double miles = userInput.nextInt();
		System.out.println("Enter price gallon: ");
		double price = userInput.nextInt();
		double cost = (distance/miles) * price;
		System.out.printf("The cost of driving is: %.2f\n", cost);
	}
}
