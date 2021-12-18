/* AUTHOR : Pranav P                                                                            
/* PROBLEM: Second smallest number                                                                        
/* DATE   : 28-11-2021  */

import java.util.*;
public class SecondSmallest {

public static void main(String[] args) {
		
	Scanner s=new Scanner(System.in);
    System.out.println("Enter the SIZE of array");
    int l=s.nextInt();
    int a[]=new int[l];
    for(int i=0;i<l;i++)
      {
       	System.out.println("Enter the elements");
       	a[i]=s.nextInt();
      }
    Arrays.sort(a);
    System.out.println("Second Smallest element= "+a[1]);
    s.close();
}
 }


