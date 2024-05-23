import java.util.Scanner;
public class perfect_number_or_not
{	
	public static void main(String[] args)
	{
		//scanner class declaration
		Scanner sc = new Scanner(System.in);
		//input from user
		System.out.print("Enter a number : ");				
		int number = sc.nextInt();
		//declare a variable to store sum of factors
		int sum = 0;
		for(int i = 1 ; i < number ; i++)
		{
			if(number % i == 0)
				sum = sum + i;
		}
		//comparing whether the sum is equal to the given number or not
		if(sum == number)
			System.out.println("Perfect Number");
		else
			System.out.println("Not an Perfect Number");
		//closing scanner class(not compulsory, but good practice)
		sc.close();													
	}
}
