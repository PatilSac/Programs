package assignment;

import java.util.Scanner;

public class Arr3 
{
	
public static void main(String[] args) {
	System.out.println("Enter the array on next line");
	Scanner sc = new Scanner(System.in);
    String[] a = sc.nextLine().split(" ");
    System.out.println("Enter the number to be searched");
    int num = sc.nextInt();
    sc.close();
    
    int[] in = new int[a.length];
    for(int i=0; i< in.length;i++)
    {
    	in[i] = Integer.parseInt(a[i]);
    	if(num == in[i])
			{
    			System.out.println("Number is present at: "+(i+1));
			}
    	}
    }
    
}
