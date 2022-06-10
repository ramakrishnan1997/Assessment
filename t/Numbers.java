import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {

		int sum = 0;
		int averagenumber = 0;
		int minimumvalue;
		int maximumvalue;
		int evennumber;
		int oddnumber;
		int altnum = 0;
		int altnumsum = 0;
		int negativenum = 0;
		int sumnegnum = 0;
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the ten number");	
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
		minimumvalue = arr[0];
		maximumvalue = arr[0];
		
		for (int j = 0; j < arr.length; j++) 
		{

			sum = sum + arr[j];
			 averagenumber = sum / arr.length;

			if (minimumvalue > arr[j]) 
			{
				minimumvalue = arr[j];
				
			}	
			if (maximumvalue < arr[j]) 
			{
				maximumvalue = arr[j];
			}
			
			
		}
		System.out.println("sum ofString all number -" + sum);
		System.out.println(" average of all number -" + averagenumber);
		System.out.println(" minimum value of number -" + minimumvalue);
		System.out.println(" maximum value of number -" + maximumvalue);
for (int j = 0; j < arr.length; j++) 
{
	

		if (averagenumber > arr[j]) 
		{
			//averagenumber = arr[j];
			System.out.println("below average number -"+arr[j]);
		}
}
for (int j = 0; j < arr.length; j++) 
{
		if (averagenumber < arr[j]) 
		{
			
			System.out.println("above average number -"+arr[j]);
		}
		
		
		}
for (int j = 0; j < arr.length; j++) 
{
		if (arr[j]%2 == 0) 
		{
			
			System.out.println("even number -"+arr[j]);
		}
		
		
		}
for (int j = 0; j < arr.length; j++) 
{
		if (arr[j]%2 != 0) 
		{
			
			System.out.println(" odd number -"+arr[j]);
		}
}


for (int j = 0; j < arr.length; j++) 
{
	
	
	
		if (j%2 == 0) // alternate number
		{
			
			System.out.println("alternate number -"+arr[j]);
			
			altnumsum = altnumsum + arr[j];
			
		}
		
		}
		
		System.out.println("sum of alternate number - "+altnumsum);
		
		for (int j = 0; j < arr.length; j++) 
		{
			
			
			
				if (arr[j] < 0) // alternate number
				{
					
					System.out.println("negative number - "+arr[j]);
					sumnegnum = sumnegnum + arr[j];
					
					
				}
				
				}
		System.out.println("sum of negative number - "+sumnegnum);
	}
}
