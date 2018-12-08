package assignment;

import java.util.Scanner;

public class Tricky3 {
	static void display(int i, int kk)
	{
		int k =i,l=1;
		
		for(k=kk;k>=1;k--)
		{

			//System.out.println("shdfs");
		
			if(k<=i)
			{
				System.out.print(k+" ");
			}	
			else
			{
				System.out.print((kk-l)+" ");
				l++;
			}
			
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter number of lines");
		Scanner sc = new Scanner(System.in);
		
		int k =sc.nextInt();
		sc.close();
		for(int i=1;i<=k;i++)
		{
			System.out.println();
			for(int j=k-i;j>=1;j--)
			{
				System.out.print("  ");
			}
			display(i, k);
		}
			
	}
}