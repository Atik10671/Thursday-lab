package arraylab;

import java.util.Scanner;

public class copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner r=new Scanner(System.in);
		System.out.println("enter value");
		for(int i=0;i<5;i++)
		{
			
			a[i]=r.nextInt();
		}
		System.out.println("element");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("2 elt");
		for(int i=0;i<5;i++)
		{
			b[i]=a[i];
			System.out.println(b[i]+" ");
			
		}
		


	}

}
