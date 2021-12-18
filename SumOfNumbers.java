/* AUTHOR : Pranav P                                                                            
/* PROBLEM: sum of two numbers                                                                         
/* DATE   : 27-11-2021*/


import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the 1st number");
		int num1 = sc.nextInt();
		
		System.out.println("enter the 2nd number");
		int num2 = sc.nextInt();
		
		int c;
		c = num1 + num2;
		System.out.print("sum = " +c);
		sc.close();

	}

}
