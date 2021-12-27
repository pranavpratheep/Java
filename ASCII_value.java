/* AUTHOR : Pranav P                                                                            
/* PROBLEM: ASCII value                                                                       
/* DATE   : 27-12-2021 */   
import java.util.*;

public class ASCII_value {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character");
		char character = sc.next().charAt(0);
		int asciivalue = character;
		System.out.println("The ASCII value of "+character+ " is : "+asciivalue);
		sc.close();
	}

}
