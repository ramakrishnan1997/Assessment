
public class Recuirtment {
	
	private String canditatename;
	private int candidateage;
	
	public Recuirtment(String canditatename,int candidateage) {
		
		this.canditatename = canditatename;
		this.candidateage = candidateage;
	}
public void recurit() throws InvalidAgeExcemption{
	
	if( candidateage < 21 || candidateage > 61  ) {
		
		throw new InvalidAgeExcemption (candidateage);
	}
	else {
		
		System.out.println("valid age..we can consider");
	}
}
}
