import java.util.Scanner;
public class Summation{
	/*Create a program that reads a set of integers, and 
	then prints the sum of the even and odd integers.*/
	public static void main(String[] args){
		//declaring and instantiating a Scanner
		Scanner readIt = new Scanner(System.in);
		//read set of integers from user
		System.out.print("Hi, kindly enter a set of numbers, a number per line: ");
		int read1 = readIt.nextInt();
		int read2 = readIt.nextInt();
		int read3 = readIt.nextInt();
		int read4 = readIt.nextInt();
		int odd1, odd2, odd3, odd4;
		int sum = 0;
		//print out the set of inetgers entered
		System.out.print("These are the data entered: ");
		System.out.printf("%d, %d, %d, %d\n", read1, read2, read3, read4);
		if((read1 % 2) == 1){
			odd1 = read1;
			sum += odd1 + read1;
		}
		else{
			read1 = read1;
			sum += read1;
		}
		if((read2 % 2) == 1){
			odd2 = read2;
			sum += read2;
		}
		else{
			read2 = read2;
			sum += read2;
		}
		if((read3 % 2) == 1){
			odd3 = read3;
			sum += read3;
		}
		else{
			read3 = read3;
			sum += read3;
		}
		if((read4 % 2) == 1){
			odd4 = read4;
			sum += read4;
		}
		System.out.printf("The sum total for everything is: %d", sum);		
		//int sum1 = read1 + (read1 // 2)
	}
}
