/* AUTHOR : Pranav P                                                                            
/* PROBLEM: Rock paper scissors
/* DATE   : 18-12-2021  */
import java.util.*;
class game
{
  String player1,player2;
  game(String player1,String player2)
  {
   this.player1 = player1;
   this.player2 = player2;
  } 

void game(String player1,String player2)
{
  if(player1.equals("rock") && player2.equals("rock"))
  {
	  System.out.print("It's a tie!");
  }
  else if(player1.equals("paper") && player2.equals("paper"))
  {
	  System.out.print("It's a tie!");
  }
  else if(player1.equals("scissors") && player2.equals("scissors"))
  {
	  System.out.print("It's a tie!");
  }
  else if(player1.equals("paper") && player2.equals("rock"))
  {
	  System.out.print("Player1 wins");
  }
  else if(player1.equals("rock") && player2.equals("paper"))
  {
	  System.out.print("Player1 wins");
  }
  else if(player1.equals("paper") && player2.equals("scissors"))
  {
	  System.out.print("Player2 wins");
  }
  else if(player1.equals("scissors") && player2.equals("paper"))
  {
	  System.out.print("Player1 wins");
  }
  else
  {
	  System.out.print("Invalid input!!");
  }
}
}
public class RockPaperScissors {

	public static void main(String[] args) {
		Scanner rps = new Scanner(System.in);
		System.out.print("Enter player1 input :-");
		String player1 = rps.next();
		System.out.print("Enter player2 input :-");
		String player2 = rps.next();
		
		game G = new game(player1.toLowerCase(),player2.toLowerCase());
        G.game(player1.toLowerCase(),player2.toLowerCase());
        rps.close();
  }

}
