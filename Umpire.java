
public class Umpire {
	
	int noFromGuesser;
	int noFromPlayer1;
	int noFromPlayer2;
	int noFromPlayer3;
	void CollectNoFromGuesser()
	{
		Guesser g=new Guesser();
		noFromGuesser=g.GuessingNumber();
	}
	
	void CollectNoFromPlayer()
	{
		Player1 p1=new Player1();
		Player2 p2=new Player2();
		Player3 p3=new Player3();
		noFromPlayer1=p1.GuesstheNo();
		noFromPlayer2=p2.GuesstheNo();
		noFromPlayer3=p3.GuesstheNo();
	
		
	}
	
	void Compare()
	{
		if(noFromGuesser==noFromPlayer1)
		{
			if(noFromGuesser==noFromPlayer2 & noFromGuesser==noFromPlayer3)
			{
				System.out.println("No Result");
				System.out.println("Play Again");
				CollectNoFromPlayer();
				Compare();
			}
			else if(noFromGuesser==noFromPlayer2)
			{
				System.out.println("Only Player1 and Player2 won the Game");		
			}
			else
			{
				System.out.println("Player1 Won");
			}
		}
		else if(noFromGuesser==noFromPlayer2)
		{
			if(noFromGuesser==noFromPlayer3)
			{
			System.out.println("Player2 and Player3 won the Game");
			
			}
			else
			{
				System.out.println("Player2 won the Game");
			}
		}
		else if(noFromGuesser==noFromPlayer3)
		{
			System.out.println("Player3 won the Game");
		}
		else
		{
			System.out.println("Game lost by Both");
		}
	}

}
