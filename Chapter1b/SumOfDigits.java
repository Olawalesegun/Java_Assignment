import java.util.Scanner;
public class SumOfDigits{  
    	public static void main(String args[]){  
    		int number, digit, sum = 0;  
    		Scanner userInput = new Scanner(System.in);  
    		System.out.print("Enter the number: ");
    		numba = userInput.nextInt();
    		//int sumIt, digit = 0;
		/*int digit = numba % 10;
		//int digitDiv = numba % 10;
		int sumIt = 0 + digit;
		int digitDiv = numba / 10;
		digitDiv = digitDiv % 10;
		sumIt = sumIt + digitDiv;
		int digitDiv2 = numba / 10;
		digitDiv2 = digitDiv % 10;
		sumIt = sumIt + digitDiv2;
		int digitDiv3 = digitDiv2 / 10;
		System.out.printf("The sum of the digit is: %f", sumIt);*/
    		while(number > 0){   
   			digit = number % 10;
   			sum = sum + digit;
   			number = number / 10;
   		}
    		System.out.println("Sum of Digits: "+sum);}
 }  
