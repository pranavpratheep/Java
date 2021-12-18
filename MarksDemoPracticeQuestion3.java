/* AUTHOR : Pranav P                                                                            
/* PROBLEM: Percentage demo using abstract class
/* DATE   : 18-12-2021  */

abstract class Mark
{
	abstract void getPercentage();
}
class A extends Mark
{
	int m1,m2,m3;
	A(int m1,int m2, int m3)
	{
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
   float percentage(float m1,float m2,float m3)
   {
	  float percentage = ((m1+m2+m3)/300)*100;
      return percentage;
   }
   void getPercentage()
   {
	   System.out.print("\n Percentage obtained by Student A = "+percentage(m1,m2,m3)+ "%");
   }
}
class B extends Mark
{
	int m1,m2,m3,m4;
	B(int m1,int m2,int m3,int m4)
	{
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
	}
	float percentage(float m1,float m2,float m3,float m4)
	{
		float percentage = ((m1+m2+m3+m4)/400)*100;
		return percentage;
	}
	void getPercentage()
	{
	  System.out.print("\n Percentage Obtained by Student B = "+percentage(m1,m2,m3,m4)+ "%");
	}
}

public class MarksDemoPracticeQuestion3 {

	public static void main(String[] args) {
		A a = new A(78,68,55);
		B b = new B(66,76,80,70);
		a.getPercentage();
		b.getPercentage();
  }
}
