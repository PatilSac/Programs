package assignment;

import java.util.Scanner;

public class Arr5 {
public static void main(String[] args) {
	
	System.out.println("Enter the array on next line");
	Scanner sc = new Scanner(System.in);
    String[] a = sc.nextLine().split(" ");
    sc.close();
    
    int[] in = new int[a.length];
    for(int i=0; i< in.length;i++)
    {
    	in[i] = Integer.parseInt(a[i]);
    }
    System.out.println("Second largest number is :"+Largest(in));

    
    
}
static int Largest(int[] a)
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
	for(int i=0;i<a.length;i++)
	{
		System.out.println(a[i]);
	}
return a[a.length-1];

}

}
