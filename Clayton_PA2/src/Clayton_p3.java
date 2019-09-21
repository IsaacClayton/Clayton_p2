import java.util.Scanner;

public class Clayton_p3 
{
	static String[] s = {"Pollution     ","Tuition       ","Health Care   ","Education     ","Deforestation "};
	
	static int[][] a = new int[5][10];
	
	public static void main(String[] args)
	{
	   double[] sum = new double[]{0, 0, 0, 0, 0};
	   double avg = 0;
	   
	   Scanner input = new Scanner(System.in);
	   
	   for(int i = 0; i < 10; i++)
	   {
	       for(int j = 0; j < 5; j++)
	       {
	           System.out.println("Rate the issue from 1-10.\n" + (j + 1) + ". " + s[j]);
	           a[j][i] = input.nextInt();
	       }
	   }
	   System.out.println("User responses");
	   for(int i = 0; i < 5; i++)
	   {
	       System.out.print("\n" + (i + 1) + "." + s[i]);
	       for(int j = 0; j < 10; j++)
	       {
	           System.out.print("|" + a[i][j] + "|	");
	           sum[i] = sum[i] + a[i][j];
	       }
	       avg = sum[i] / 10;
	       System.out.println("Average = " + avg);
	   }
	   double max = sum[0]; 
	   double min = sum[0];
	   int maxI = 0;
	   int minI = 0;
	   
	   for(int i = 0; i < 5; i++)
	   {
	       if(max < sum[i])
	       {
	           max = sum[i];
	           maxI = i;
	       }
	       if(min > sum[i])
	       {
	           min = sum[i];
	           minI = i;
	       }
	   }
	   
	   input.close();
	   System.out.println("");
	   System.out.println("MaximumRated Issue: " + s[maxI]+"Ratings: " + max);
	   System.out.println("Minimum rated Issue: " + s[minI]+"Ratings: " + min);
	  
	}
}
