import java.util.Scanner;
public class Num2Year{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
 		System.out.println("Enterthe number of minutes: ");
 		double noOfMinutes = userInput.nextInt();
 		double constMinutesInaYear = 525600;
 		double noOfYear = noOfMinutes/constMinutesInaYear;
 		double noOfDay = noOfMinutes % constMinutesInaYear;
 		System.out.printf("%f minutes is approximately %f years and %f days", noOfMinutes, noOfYear, noOfDay);
 	}
 }		
