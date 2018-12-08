package assignment;
import java.util.Scanner;

public class Arr1 
{
	    static int getMissingNo (int a[], int n) 
	    { 
	        int i, total; 
	        total  = (n+1)*(n+2)/2;    
	        for ( i = 0; i< n; i++) 
	           total = total- a[i]; 
	        return total; 
	    }
	       
	    /* program to test above function */
	    public static void main(String args[]) 
	    { 
	    	
	    	Scanner sc = new Scanner(System.in);
	        String[] a = sc.nextLine().split(" ");
	        sc.close();
	        int[] in = new int[a.length];
	        for(int i=0; i< in.length;i++)
	        {
	        	in[i] = Integer.parseInt(a[i]);
	        	
	        }
	        int miss = getMissingNo(in,in.length); 
	        System.out.println(miss);    
	    }
			
		

}
