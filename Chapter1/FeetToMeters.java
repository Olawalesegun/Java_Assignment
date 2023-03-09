import java.util.Scanner;
public class FeetToMeters{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in); 
		System.out.println("Enter a value for feet: ");
		double feet = userInput.nextDouble();
		double feet2 = feet * 0.305;
		System.out.printf("%.1f feet is %.1f meters:\n", feet, feet2);
	}
}
