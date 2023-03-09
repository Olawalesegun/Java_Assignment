import java.util.Scanner;
public class Bmi{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		System.out.println("Kindly enter  the weight: ");
		double weightBmi = userInput.nextInt();
		System.out.println("Kindly enter  the inches: ");
		double inchesBmi = userInput.nextInt();
		System.out.printf("You entered weight: %f, and inches: %f\n", weightBmi, inchesBmi);
		weightBmi = weightBmi * 0.45359237;
		inchesBmi = (inchesBmi * inchesBmi) * 0.0254;
		System.out.printf("After conversion, weight is %f, and inches: %f\n", weightBmi, inchesBmi);
		double bodyMI = weightBmi/inchesBmi;
		System.out.printf("BMI is %f\n", bodyMI);
	}
}
