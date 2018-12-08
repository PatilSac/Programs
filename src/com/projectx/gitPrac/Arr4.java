package assignment;

import java.util.Scanner;

public class Arr4 
{

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
    System.out.println("Largest number is :"+Largest(in));
    System.out.println("Smallest number is :"+Smallest(in));
    
}
static int Largest(int a[])
{
	int tmp = a[0];
	for(int i =0;i<a.length;i++)
	{
		if(tmp>a[i])
		{
			tmp = a[i];
		}
	}
	
	
	return tmp;
}
static int Smallest(int a[])
{
	int tmp = a[0];
	for(int i =0;i<a.length;i++)
	{
		if(tmp<a[i])
		{
			tmp = a[i];
		}
	}
	
	
	return tmp;
}
}