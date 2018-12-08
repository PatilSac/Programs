package assignment;

import java.util.Scanner;

public class Pat9 
{
	
public static void main(String[] args) {
	System.out.println("Enter number of lines");
	Scanner sc = new Scanner(System.in);
	
	int k =sc.nextInt();
	sc.close();
	
	for(int i=1;i<=k;i++)
	{
		System.out.println();
		for(int j=1;j<=k;j++)
		{
			if(j<i)
				System.out.print("  ");
			else
				System.out.print(j+" ");
		}
			
	}
	for(int i=k-1;i>=1;i--)
	{
		System.out.println();
		for(int j=1;j<=k;j++)
		{
			//System.out.println(i+" "+j);
			
			if(j<i)
				System.out.print("  ");
			else
				System.out.print(j+" ");
		}
			
	}
}

}
