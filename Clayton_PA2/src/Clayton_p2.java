import java.util.Scanner;

public class Clayton_p2 {

	public static void main(String[] args)
	{
		
		double BMI;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter 1 for Imperial or 2 for Metric");
		
		int answer = in.nextInt(); 
		
		if(answer == 1)
		{
			System.out.print("Please enter you weight in pounds: ");
			double weightInPounds = in.nextDouble();
			
			System.out.print("Please enter your height in inches: ");
			double heightInInches = in.nextDouble();
			
			heightInInches = heightInInches * heightInInches;
			BMI = (703 * weightInPounds) / heightInInches;
			System.out.printf("Your BMI is %.2f\n", BMI);
			System.out.println("BMI Categories:");
		    System.out.println("Underweight = < 18.5");
		    System.out.println("Normal Weight = 18.5-24.9");
		    System.out.println("Overweight = 25-29.9");
		    System.out.println("Obesity = BMI of 30 or greater");
		    in.close();
			
		}
	    
		if(answer == 2)
		{
			System.out.print("Please enter you weight in Kilograms: ");
			double weightInKilograms = in.nextDouble();
			
			System.out.print("Please enter your height in Meters: ");
			double heightInMeters = in.nextDouble();
			
			heightInMeters = heightInMeters * heightInMeters;
			BMI = weightInKilograms / heightInMeters;
			System.out.printf("Your BMI is %.2f", BMI);
			System.out.println("BMI Categories:");
		    System.out.println("Underweight = < 18.5");
		    System.out.println("Normal Weight = 18.5-24.9");
		    System.out.println("Overweight = 25-29.9");
		    System.out.println("Obesity = BMI of 30 or greater");
		    in.close();

		}
		
		in.close();
		
		
	}

}
