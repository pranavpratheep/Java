/* AUTHOR : Pranav P                                                                            
/* PROBLEM: Vowel or consonant
/* DATE   : 30-11-2021  */

import java.util.*;
public class VowelConsonent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the character :");
		char c = sc.next().charAt(0);
		
		switch(c)
		{
		   case 'a':
		   case 'e':
		   case 'i':
		   case 'o':
		   case 'u':
		   case 'A':
		   case 'E':
		   case 'I':
		   case 'O':
		   case 'U':
		   System.out.print("Vowel");
		   break;
		   
		   default: System.out.print("Consonants");
		   break;
		
		}
	   sc.close();	
       		
		
	}

}
