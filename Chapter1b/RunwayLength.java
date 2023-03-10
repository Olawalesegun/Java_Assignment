import java.util.Scanner;
public class RunwayLength{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter Speed and acceleration: ");
		double speed = userInput.nextDouble();
		double acceleration = userInput.nextDouble();
		double len = (speed * speed) / (2 * acceleration);
		System.out.printf("The minimum runway length for this airplane is: %f", len);
	}
}
