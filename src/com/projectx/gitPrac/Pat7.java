package assignment;

import java.util.Scanner;

public class Pat7 {

	public static void main(String[] args) {
		System.out.println("Enter number of lines");
		Scanner sc = new Scanner(System.in);
		
		int k =sc.nextInt();
		sc.close();
		
		for(int i=k;i>=1;i--)
		{
			System.out.println();
			for(int j =k; j>=i;j--)
			{
				System.out.print(j+" ");
			}
		}
	}
}
