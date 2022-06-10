import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
   
   
    
    System.out.println("enter no.of times.you want");
    //double a= sc.nextDouble();
    int b=sc.nextInt();
    int head=0;
    int tail=0;
    for(int i=0;i<b;i++)
    {

    	if(Math.random()>0.5)
        {
     	   System.out.println("Heads");
     	   head++;
     	  
        }
        else
        {
     	   System.out.println("Tails"); 
     	 tail++;
        }
    	
    	
    }
    System.out.println("heads ="+head);
    System.out.println("tails "+tail);
    
	}	


}