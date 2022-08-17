package string;

public class CouuntVowel {
public static int countVowel(String str)
{
	int i,count=0;
	char ch;
	for(i=0;i<str.length();i++)
	{
		ch=str.charAt(i);
		if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		{
			count++;
		}
	}
	return count;
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="good morning";
		int count=countVowel(str);
		System.out.println("number of vowels: "+count);

	}

}
