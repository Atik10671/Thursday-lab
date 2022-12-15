package stringlab;
import java.util.Scanner;
public class vowelpresent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("enter a vowel");
		char c=sc.next().charAt(0);
		int f=0;
		for(int i=0;i<s.length();i++)
		{
			if(c==s.charAt(i))
			{
				System.out.println("vowel present");
				f=1;
				break;
			}
		}
		
		if(f==0)
		{
			System.out.println("no vowel");
		}

	}

}
