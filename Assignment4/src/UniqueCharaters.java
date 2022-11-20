
public class UniqueCharaters {

	public static void main(String[] args) {
		String s1="Kamal Hasan";
		String s2="";
		boolean flag=false;
		
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)!=s1.charAt(j))
				{
					if(j==s1.length()-1 & s1.charAt(i)!='0')
					{
					s2=s2+s1.charAt(i);
					}
				}
				
				else {
					s1=s1.replace(s1.charAt(j), '0');
					flag=true;
				}
			}
		}
		System.out.println(s2);
		if(flag==true)
		{
		System.out.println("String do not contain all unique charaters");
		}
		else
			System.out.println("String contains all unique charaters");
	}

}
