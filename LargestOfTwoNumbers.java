/* AUTHOR : Pranav P                                                                            
/* PROBLEM: check largest of two numbers                                                                         
/* DATE   : 27-11-2021  */


import java.util.*;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st number");
        int num1 = sc.nextInt();
        
        System.out.println("enter the 2nd number");
        int num2= sc.nextInt();
        
        if(num1 > num2)
        {
        	System.out.print(num1 + " is larger");
        }
	    else
	    {
		    System.out.print(num2 + " is larger");
	    }
        sc.close();
	} 		

}
