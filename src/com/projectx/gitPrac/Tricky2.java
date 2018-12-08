package assignment;

import java.util.Scanner;

public class Tricky2 {
	static void display(int i)
	{
		int k =i,l=1;
		
		for(k=1;k<=(i*2)-1;k++)
		{
			
			if(k==1)
			{
				for(int x=(i*2);x<=1;x--)
				{
					System.out.print(" ");
				}
			}
			if(k<=i)
			{
				
				
				System.out.print(k+" ");
			}	
			else
			{
				System.out.print((i-l)+" ");
				l++;
			}
			
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter number of lines");
		Scanner sc = new Scanner(System.in);
		
		int k =sc.nextInt();
		sc.close();
		for(int i=k;i>=1;i--)
		{
			System.out.println();
			for(int j=1;j<=k-i;j++)
			{
				System.out.print("  ");
			}
			display(i);
		}
			
	}
}