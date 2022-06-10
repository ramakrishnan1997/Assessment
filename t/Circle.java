import java.util.Scanner;
public class Circle {
	double area;
	
double radius;
public static double pi=3.14;
Circle(double radius)
{
	this.radius=radius;
}
public double getArea()
{
	return area=3.14*radius*radius;
}
public void printInfo()
{
	System.out.println("Radius "+radius);
	System.out.println("Area "+area);
}
}
