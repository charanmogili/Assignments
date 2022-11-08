import java.util.Scanner;

 class Player1 {
	int GuessedNo;
	Scanner sc2=new Scanner(System.in);
	public int GuesstheNo() 
	{
		Scanner sc2=new Scanner(System.in);
		
		System.out.println("Player1 Guess the Number");
		GuessedNo=sc2.nextInt();
		if(GuessedNo>=0 & GuessedNo<10)
		{
           return GuessedNo;
		}else 
		{
			System.out.println("Number Out of Range");
			System.out.println("choose the number between 0 to 9");
			GuesstheNo();
		}
		return GuessedNo;		
	}
}

 class Player2 {
	int GuessedNo;
	Scanner sc2=new Scanner(System.in);
	
	public int GuesstheNo() 
	{
		Scanner sc2=new Scanner(System.in);
		
		System.out.println("Player2 Guess the Number");
		GuessedNo=sc2.nextInt();
		if(GuessedNo>=0 & GuessedNo<10)
		{
           return GuessedNo;
		}else 
		{
			System.out.println("Number Out of Range");
			System.out.println("choose the number between 0 to 9");
			GuesstheNo();
		}
		return GuessedNo;
		
	}
 }
 
 class Player3 {
		int GuessedNo;
		Scanner sc2=new Scanner(System.in);
		
		public int GuesstheNo() 
		{
			Scanner sc2=new Scanner(System.in);
			
			System.out.println("Player3 Guess the Number");
			GuessedNo=sc2.nextInt();
			if(GuessedNo>=0 & GuessedNo<10)
			{
	           return GuessedNo;
			}else 
			{
				System.out.println("Number Out of Range");
				System.out.println("choose the number between 0 to 9");
				GuesstheNo();
			}
			return GuessedNo;
			
		}
	 }
