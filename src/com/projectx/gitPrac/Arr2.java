package assignment;

import java.util.Scanner;

public class Arr2 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        sc.close();
        
        int[] in = new int[a.length];
        for(int i=0; i< in.length;i++)
        {
        	in[i] = Integer.parseInt(a[i]);
        }
        
        for(int i =0; i<in.length;i++)
        {
        	for(int j=i+1; j<in.length;j++)
        	{
        		if(a[i] == a[j])
        		{
        			System.out.println("Duplicate number : "+a[i]);
        		}
        	}
        }
	}

}
