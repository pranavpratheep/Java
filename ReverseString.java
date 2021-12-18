/* AUTHOR : Pranav P                                                                            
/* PROBLEM: print hello world                                                                        
/* DATE   : 27-11-2021 */   

import java.util.Scanner;
public class ReverseString {
	
public static void main(String[] args) {
	
  Scanner s=new Scanner(System.in);
  System.out.println("enter the string to be reversed");
  String str=s.nextLine();
  int len=str.length();
  System.out.println("REVERSED STRING \n");
  for(int i=len-1;i>=0;i--)
	{
	 System.out.print(str.charAt(i));
	}
  s.close();
			
}
 }
		
