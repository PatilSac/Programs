package assignment;

import java.util.Scanner;

public class Problem2_Sachin 
{
	
	public static void main(String[] args) 
	{
		int lines = 4;
//		System.out.println("Enter number of lines expected");
//		Scanner sc = new Scanner(System.in);
//		lines = sc.nextInt();
		int num = 1;
		for(int i=1; i<=lines; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
		
	}

}
