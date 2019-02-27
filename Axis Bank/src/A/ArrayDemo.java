package A;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) 
	
	{
/*int[] a= {10,20,30,40};

for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}*/
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size :");
		int asize=sc.nextInt();
		
		int[] a= new int[asize];
		int sum=0;
		System.out.println("Enter array Elements");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("a["+i+"]=");
			a[i]=sc.nextInt();
			sum=sum+a[i];
		}
			System.out.println("sum of array is :"+ sum);
			
			
		
		
		/*int[] a=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]="+ a[i]);
			//System.out.println(a[i]);
		}*/
	}

}
