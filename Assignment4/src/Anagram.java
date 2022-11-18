
public class Anagram {

	public static void main(String[] args) {
		String s1="A Gentle Man";
		String s2="Elegant Man";
		
		s1=s1.replace(" ", "");
		s2=s2.replace(" ", "");
		String s3="";
		String s4="";
		System.out.println(s1);
		
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='A' & s1.charAt(i)<='Z')
			{
				s3=s3+(char)(s1.charAt(i)+32);
			}
			else
				s3=s3+s1.charAt(i);
		}
		System.out.println(s3);
		
		
		
		for(int i=0;i<s2.length();i++)
		{
			if(s2.charAt(i)>='A' & s2.charAt(i)<='Z')
			{
				s4=s4+(char)(s2.charAt(i)+32);
			}
			else
				s4=s4+s2.charAt(i);
		}
		System.out.println(s4);
		boolean flag=false;
		
		  for(int i=0;i<s3.length();i++)
		  {
			 for(int j=0;j<s3.length();j++)
			 {
				 if(s3.charAt(i)==s4.charAt(j) & (s3.length()==s4.length()))
				 {
					 flag=true;
					 break;
				 }
				 else
				 {
					 flag=false;
				 }
			 }
			 if(flag==false)
				{
				 System.out.println(s1+" and "+s2+" are not Anagram");
				 break;
				}
		  }
		 if(flag==true)
		 {
			 System.out.println(s1+" and "+s2+" are Anagram");
		 }
	}
}
