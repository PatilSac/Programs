package assignment;

import java.util.Scanner;

public class Pat8 {
	static void display(int i)
	{
		int k =i,l=1;
		if(i == 1)
		{
			System.out.print(i);
		}
		else
		{
			for(k=1;k<=(i*2)-1;k++)
			{
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
	}
	public static void main(String[] args) {
		System.out.println("Enter number of lines");
		Scanner sc = new Scanner(System.in);
		
		int k =sc.nextInt();
		sc.close();
		for(int i=1;i<=k;i++)
		{
			System.out.println();
			display(i);
		}
			
	}
}