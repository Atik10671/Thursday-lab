package arraylab;
import java.util.Scanner;
public class reversenumber {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("how many elements you want to prints");
		int n=Sc.nextInt();
		int[] ele=new int [n];
		//enter array elements
		int i;
		
		for(i=0;i<n;i++)
		{
			System.out.println("enter array elements" +(i+1));
			ele[i]=Sc.nextInt();
		}
	
		for(i=n-1;i>=0;i--)
		{
			System.out.println(ele[i]+" ");
		}
			
		

	}

}
