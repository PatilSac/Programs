package assignment;

public class ArrayAssignment 
{
	
	
	public static void main(String[] args) 
	{
		int c = '1';
		System.out.println(c);
		
		String s = "1dW24G35Ahps9";
		String digit = "";
		String alpha = "";
		//String s_arry[]= s.split("");
		for(int i=0; i<s.length(); i++)
		{
			int o = s.charAt(i);
			if(o>=48 && o<=57)
			{
				digit = digit+s.charAt(i);
			}
			else
			{
				alpha = alpha + s.charAt(i);
			}
		}
		
		System.out.println(alpha +" "+ digit);
		
		
	}
	
	

}
