package assignment;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class assignmnet {

    public static void lines(String s)
    {

         String[] words = s.split("\\s+");
         for (int i = 0; i < words.length; i++) {
             // You may want to check for a non-word character before blindly
             // performing a replacement
             // It may also be necessary to adjust the character class
             words[i] = words[i].replaceAll("[^\\w]", "");
             System.out.println(words[i]+" "+i);
         }
         
    }
    
    public static String fileloc()
    {
    	Scanner scanner = new Scanner(System.in);
    	String input = scanner.nextLine();
    	scanner.close();
    	
    	return input;
    	
    }
        
	public static void main (String [] args) throws Exception
	{
		
		//String s = fileloc();
		String s = "G:\\Python\\selenium\\input.txt";
		int i = 0;
		
		FileInputStream fstream = new FileInputStream(s);
		BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

		String strLine;

		//Read File Line By Line
		while ((strLine = br.readLine()) != null)   
		{
		  // Print the content on the console
		  System.out.println (strLine);
		  lines(strLine);
		  i += 1;
		}
		System.out.println("No of lines: "+i);
		
		//Close the input stream
		br.close();
		
		
		
	}

}
