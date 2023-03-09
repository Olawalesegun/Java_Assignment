import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		float x1, x2, x3, y1, y2, y3;
		System.out.println("Enter three points, starting with (x1, y1) for a triangle: ");
		x1 = userInput.nextInt();
		y1 = userInput.nextInt();
		System.out.println("Enter (x2, y2) for a triangle: ");
		x2 = userInput.nextInt();
		y2 = userInput.nextInt();
		System.out.println("Enter (x3, y3) for a triangle: ");
		x3 = userInput.nextInt();
		y3 = userInput.nextInt();
		//System.out.printf("Here are the details entered; (x1 and y1): %f, %f. (x2 and y2): %f, %f. (x3 and y3): %f, %f", x1, y1, x2, y2. x3, y3);
		float side1 = x1 + y1;
		float side2 = x2 + y2;
		float side3= x3 + y3;
		System.out.printf("Here are the details side1: %.2f, side2: %.2f, side3: %.2f\n", side1, side2, side3); 
		double s = (side1 + side2 + side3);
		s = s/2;
		System.out.printf("s = %.4f\n", s);
		double area = s * (s-side1); //* (s-side2) * (s-side3);
		area = area * (s - side2);
		area = area * (s - side3);
		area = area * 1/2;
		System.out.printf("The area of the triangle is: %.1f", area);
	}
}
