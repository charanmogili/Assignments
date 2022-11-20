
public class Panagram {

	public static void main(String[] args) {
		String s1="the quick brown fox jumps over the lazy dog";
		s1=s1.replace(" ", "");
		
		char[] ar=s1.toCharArray();
		
		int[] ar2=new int[26];
		boolean flag=false;
		for(int i=0;i<ar.length;i++)
		{
			int d=ar[i]-97;
			ar2[d]++;
		}
		for(int i=0;i<ar2.length;i++)
		{
			if(ar2[i]==0)
			{
				System.out.println("Its is not a Pangram");
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("it is a Pangram");
		}
	}
}
