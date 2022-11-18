
public class Duplicate {

	public static void main(String[] args) {
		String s1="charanreddy";
		char[] ar=s1.toCharArray();
		int count;
		
		for(int i=0;i<s1.length();i++)
		{
			count=1;
			for(int j=i+1;j<ar.length;j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
					ar[j]='0';
				}
			}
			if(count>1 && ar[i]!='0')
			{
			System.out.println(s1.charAt(i)+" is repeated "+count+" times");
			}
		}
	}
}
