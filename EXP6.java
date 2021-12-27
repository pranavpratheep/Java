import java.util.*;
public class EXP6
{
	public static void main(String[] args) 
	{
		   Sreelakshmi e=new Sreelakshmi();
		   Scanner in=new Scanner(System.in);
		   System.out.print("Enter the basic salary of Delna: ");
		   float salary=in.nextFloat();
		   System.out.print("Enter the DA of Delna: ");
		   float da=in.nextFloat();
		   System.out.print("Enter the HAR of Delna: ");
		   float hra=in.nextFloat();
	   	   e.display();
		   e.calcSalary(salary,da,hra);	
		   in.close();
	}
}

class Delna
{
	float da;
    float salary,hra;  
	 
  void	display()
  {
	  System.out.println("Name of the class is Delna");
  }	
  
  void calcSalary(float salary,float da,float hra)
  {   
	  float GrossSalary=salary+10*da+10*hra;
	  System.out.println("The Gross Salary of the Delna is "+GrossSalary);
  }
}

class Sreelakshmi extends Delna
{
	void	display()
	  {
          super.display(); 
		  System.out.println("Name of the class is Sreelakshmi");
	  }	
	  void calcSalary(float salary,float da,float hra)
	  {  
		  super.calcSalary(salary,da,hra);
		  float GrossSalary=salary+10*da+10*hra;
		  System.out.println("The Gross Salary of the Sreelakshmi is "+(2*GrossSalary));
	  }
	
}
