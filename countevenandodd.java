package arraylab;
import java.util.Scanner;
public class countevenandodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter hoe many elements you want to prints");
		Scanner Sc=new Scanner(System.in);
		int size=Sc.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter the elements");
			arr[i]=Sc.nextInt();
		}
		int even=0;
		int odd=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("is even number" +arr[i]);
				even++;
			}
			else
			{
				System.out.println("is odd number" +arr[i]);
				odd++;
			}
		}

	}

}
