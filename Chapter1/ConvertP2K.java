import java.util.Scanner;
public class ConvertP2K{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter a number in pounds: ");
		double poundss = userInput.nextInt();
		double kiloG = poundss * 0.454;
		System.out.printf("%f pounds is %f kilograms\n", poundss, kiloG);
	}
}
