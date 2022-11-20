
public class MaximumOccuringChar {

	public static void main(String[] args) {
		String s1="Yuri Beznovich";
		s1=s1.replace(" ", "");
		char[] ar=s1.toCharArray();
		int count;
		String s3="";
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='A' & s1.charAt(i)<='Z')
			{
				s3=s3+(char)(s1.charAt(i)+32);
			}
			else
				s3=s3+s1.charAt(i);
		}
		
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
			System.out.println(s1.charAt(i)+" is repeating "+count+" times");
			}
		}
	}
}
