package assignment;

import java.util.Scanner;

public class Arr8 {
public static void main(String[] args) {
	

	System.out.println("Enter the array on next line");
	Scanner sc = new Scanner(System.in);
    String[] in = sc.nextLine().split(" ");
    sc.close();
    
    int[] a = new int[in.length];
    for(int i=0; i< in.length;i++)
    {
    	a[i] = Integer.parseInt(in[i]);
    }
	
	int tmp = 0;
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]>a[j])
			{
				tmp = a[i];
				a[i] = a[j];
				a[j] = tmp;
				
			}
		}
	}
	 for(int i=0; i< in.length;i++)
	    {
	    	System.out.print(a[i]+" ");
	    }
	int c = 0;
	for(int i=0;i<a.length-1;i=i+2)
	{
		
		if(a[i]!=a[i+1]&&c!=1)
		{
			System.out.println("missing "+(a[i]));
			c = 1;
		}
		
	}
	if(c==0)
	{
		System.out.println("missing "+a[a.length-1]);
	}
	
	
}
}
