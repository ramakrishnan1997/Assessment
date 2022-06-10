
public class InvalidAgeExcemption extends Exception
{
private int age;

public InvalidAgeExcemption(int age) {
	
	this.age = age;
}
			
	public String display() {
		
		return " sorry! This is invalid age its can't be taken - "+age;
	}
}
