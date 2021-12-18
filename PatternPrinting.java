/* AUTHOR : Pranav P                                                                            
/* PROBLEM: pattern printing                                                                         
/* DATE   : 29-11-2021 */   

public class PatternPrinting {

	public static void main(String[] args) {
		int i,j,row = 6;
		for(i=0;i<row;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();	
		}
	}

}
