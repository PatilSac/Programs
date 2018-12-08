package assignment;

import java.util.Scanner;

public class Arr6 {
	
	static int[] sort(int a[])
	{
		int tmp =0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
					
				}
			}
			

	}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array on next line");
	    String[] a = sc.nextLine().split(" ");
	    
	    int m[] = new int[a.length];
	    for(int i=0; i< a.length;i++)
	    {
	    	m[i] = Integer.parseInt(a[i]);
	    }
	    System.out.println("Enter the array on next line");
	    a = sc.nextLine().split(" ");
	    
	    int n[] = new int[a.length];
	    for(int i=0; i< a.length;i++)
	    {
	    	n[i] = Integer.parseInt(a[i]);
	    }
		
		m = sort(m);
		n = sort(n);
		int c = 0;
		for(int i=0; i<m.length; i++)
		{
			if(m[i] != n[i])
			{
				System.out.println("Array are not identical");
				c = 1;
			}
		}
		if(c==0)
		{
			System.out.println("Array are identical ");
		}
	}

}
