import java.util.Scanner;
public class CalculationEnergy{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in); 
		System.out.println("Enter the amount of water in kilograms: ");
		float waterAmount = userInput.nextInt();
		System.out.println("Enter the initial temperature: ");
		float initTemp = userInput.nextInt();
		System.out.println("Enter the final temperature: ");
		float finTemp = userInput.nextInt();
		float diff = finTemp - initTemp;
		float Q = waterAmount * diff * 4184;
		System.out.printf("The energy needed is: %.2f", Q);
	}
}		
