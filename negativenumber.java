package arraylab;
import java.util.Scanner;
public class negativenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println("enter elemens you wants to prints");
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int[] elt=new int[n];
     //print array elements
     for(int i=0;i<n;i++)
     {
    	 System.out.println("enter elemets" +(i+1));
    	 elt[i]=sc.nextInt();
     }
     for(int i=0;i<n;i++)
     {
    	 if(elt[i]<0)
    	 {
    		 System.out.println( "negative number in array elements ="+elt[i]);
    	 }
     }
	}

}
