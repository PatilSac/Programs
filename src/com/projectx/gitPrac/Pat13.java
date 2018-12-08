package assignment;

import java.util.Scanner;

public class Pat13 {
	
	public static void main(String[] args) {
		System.out.println("Enter number of lines");
		Scanner sc = new Scanner(System.in);
		
		int k =sc.nextInt();
		sc.close();
		for(int i=1;i<=k;i++)
		{
			
			System.out.print(" ");
			for(int j=1;j<=k-i+1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
//			
//			
//			if(i%2==0)
//			{
//				
//			}
//			else
//			{
//				for(int j=1;j<=i;j++)
//				{
//					
//				}
//				
//			}
//			System.out.println();
//			for(int j =1;j<=i;j++)
//				System.out.print(j+" ");
//		}
	
			System.out.println();
		}
		
	}
	

}
