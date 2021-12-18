/* AUTHOR : Pranav P                                                                            
/* PROBLEM: Bank demo
/* DATE   : 18-12-2021  */

abstract class Bank
{
   abstract void getBalance();
}
class BankA extends Bank
{
  void getBalance()
  {
	  System.out.print("\nBank A = $100");
  }
}
class BankB extends Bank
{
	void getBalance()
	{
		System.out.print("\nBank B = &150");
	}
}
class BankC extends Bank
{
	void getBalance()
	{
		System.out.print("\nBank C = $200");
	}
}
public class BankdemoQuestion3 {

	public static void main(String[] args) {
		Bank A = new BankA();
		Bank B = new BankB();
		Bank C = new BankC();
		
		A.getBalance();
		B.getBalance();
		C.getBalance();

  }

}
