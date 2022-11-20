
public class RemoveDuplicate {

	public static void main(String[] args) {
		String s1="Kamal hasan";
		s1=s1.replace(" ", "");
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
		
		for(int i=0;i<s3.length();i++)
		{
			for(int j=i+1;j<s3.length();j++)
			{
				if(s3.charAt(j)==s3.charAt(i))
                  {
                     s3=s3.replace(s3.charAt(j), ' ');
	              }
			}
		}
		s3=s3.replace(" ", "");
		System.out.println(s3);
	}
}
