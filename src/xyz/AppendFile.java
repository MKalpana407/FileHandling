package xyz;

import java.io.FileWriter;
import java.io.IOException;

public class AppendFile {
	public static void main(String[] args)
	{
		String data=" This data is appended.....";
		try
		
		{
			FileWriter output = new FileWriter("data1.txt",true);
		}
		catch(IOException ex)
		{
			System.out.println("File append error");
		}
	}

}
