/* AUTHOR : Pranav P                                                                            
/* PROBLEM: CHECK A NUMBER IS PRIME OR NOT                                                                         
/* DATE   : 27-11-2021  */


import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int fact = 0;
		 System.out.println("enter a number");
		 int num = sc.nextInt();
		
		for(int i=2;i<num/2;i++)
		 {
			if(num % i == 0)
			{
				fact = 1;
				break;
			}
		 }
		    if(fact==0)
		     {
			   System.out.print(num+" is a prime number");
		     }
		    else
	     	{
			  System.out.print(num+" is not a prime number");	
		    }
		    sc.close();   
	}
	 
}
