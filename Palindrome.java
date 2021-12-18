/* AUTHOR : Pranav P                                                                            
/* PROBLEM: palindrome                                                                       
/* DATE   : 29-11-2021 */   

import java.util.*;
public class Palindrome {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string:");
String str=sc.nextLine();
String revstr="";
char ch;
for(int i=0;i<str.length();i++)
{
ch=str.charAt(i);
revstr=ch+revstr;
}
if(str.equals(revstr))
{
System.out.println("PALLINDROME");
}
else
{
System.out.println("NOT PALLINDROME");
}
sc.close();
}
}
