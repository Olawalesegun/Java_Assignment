import java.util.Scanner;
public class AverageAcceleration{
	public static void main(String[] args){
		/* A program that prompts user to enter the starting 
		velocity in meters/seconds, the ending velocity v1 meters/second
		and the time span t in seconds, and displays the average acceleration.*/
		float v0, v1, t, a;
		String name;
		System.out.printf("Welcome, what may I call you?: %s\n", name);
		Scanner userInputs = new Scanner(System.in);
		System.out.printf("Hi %s, Enter v0, v1 and t: ", name);
		v0 = userInputs.nextInt();
		v1 = userInputs.nextInt();
		t = userInputs.nextInt();
		a = (v1 - v2) / t;
		//System.out.printf("Your v0, v1, and t is: %f %f %f", v0, v1, t);
		System.out.println("The average acceleration is: %f", a);
	}
}	
