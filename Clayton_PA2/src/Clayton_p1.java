import java.util.Scanner;

public class Clayton_p1 {

	public static void main(String[] args) 
	{
		System.out.print("Enter the number you want to encrypt: ");
		
		Scanner scnr = new Scanner(System.in);
		int input = scnr.nextInt();
		scnr.close();
		
		int numOne = input / 1000;
		int numTwo = (input % 1000) / 100;
		int numThree = (input % 100) / 10;
		int numFour = input % 10;
		
		numOne = (numOne + 7) % 10;
		numTwo = (numTwo + 7) % 10;
		numThree = (numThree + 7) % 10;
		numFour = (numFour + 7) % 10;
		
		System.out.print("Your encrypted number is: ");
		System.out.printf("%d%d%d%d", numThree, numFour, numOne, numTwo);

	}

}
