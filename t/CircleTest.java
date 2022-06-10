import java.util.Scanner;

public class CircleTest {
public static void main(String[] args)
{
	 double sum=0,sum1=0;
	 int arr[]=new int[100];
	 int arr1[]=new int[100];
	 for(int i=0;i<arr.length;i++)
	 {
		 arr[i]=(int)(Math.random()*10);
		 arr1[i]=(int)(Math.random()*10);
		 Circle c= new Circle(arr[i]);
		 Circle1 c1= new Circle1(arr1[i],arr[i]);
		 sum=sum+c.getArea();
		 sum1=sum1+c1.getArea();
	 }
	 
	 System.out.println(sum);
	 System.out.println(sum1);
}
}
