package epam.task2;

import java.util.Scanner;

public class Newyear {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of the chocalates");
		int n=sc.nextInt();
		System.out.println("enter the weights of chocoaltes");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the number of the sweets");
		int n1=sc.nextInt();
		System.out.println("enter the weights of sweets");
		int b[]=new int[n];
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		Chocolate c=new Chocolate();
		sweets s=new sweets();
		int chocolatesweight=c.count(a);
		int sweetsweight=s.count(b);
		System.out.println(chocolatesweight+" "+sweetsweight);
		System.out.println("eneter the start and last value");
		int st=sc.nextInt();
		int l=sc.nextInt();
		c.rangesort(a, st, l);
		c.rangesort(b,st,l);
		
		
      
	}

}
