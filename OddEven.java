/* AUTHOR : Pranav P                                                                            
/* PROBLEM: odd or even                                                                        
/* DATE   : 28-11-2021 */  
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number");
		int num = sc.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.print(num +" is even");
		}
		else
		{
			System.out.print(num +" is odd");
		}
		sc.close();
	}
	

}
