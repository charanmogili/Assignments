
public class Vowels {

	public static void main(String[] args) {
		String s1="Zaheer Khan";
		s1=s1.replace(" ", "");
		String s3="";
		int vowels=0;
		int consonants=0;
		int specialCharaters=0;
		
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
		
		for(int i=0;i<s3.length();i++)
		{
			if(s3.charAt(i)=='a' || s3.charAt(i)=='e' || s3.charAt(i)=='i' || s3.charAt(i)=='o' || s3.charAt(i)=='u')
			{
				++vowels;
			}
			else if(s3.charAt(i)=='!' || s3.charAt(i)=='@' || s3.charAt(i)=='#' || s3.charAt(i)=='$' || s3.charAt(i)=='*'){
				++specialCharaters;
			}
			else
				++consonants;
		}
		System.out.println("Number of Vowels :"+vowels);
		System.out.println("Number of Consonants :"+consonants);
		System.out.println("Number of SpecialCharaters :"+specialCharaters);
	}
}
