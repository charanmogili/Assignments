import java.util.Scanner;

public class Guesser {
	int GuesserNo;
	Scanner sc1=new Scanner(System.in);
	
	public int GuessingNumber() 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Choose a number you like the most");
		GuesserNo=sc1.nextInt();
		if(GuesserNo>=0 & GuesserNo<10)
		{
           return GuesserNo;
		}else 
		{
			System.out.println("Number Out of Range");
			System.out.println("choose the number between 0 to 9");
			GuessingNumber();
		}
		return GuesserNo;
	}
}
