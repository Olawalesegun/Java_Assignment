import java.util.Scanner;
public class Bathrom{

	public static void main(String[] args){
		Scanner inputCollector = new Scanner(System.in);
		System.out.println("Hi, what's your name?");
		String result = inputCollector.nextLine();
		System.out.println("Hello "+ result);
	}
}
