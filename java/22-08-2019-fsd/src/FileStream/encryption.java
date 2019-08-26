package FileStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class encryption {
void encrypt(String source,String dest,int shift)
{
	BufferedReader reader;
	BufferedWriter writer;
	try {
		reader=new BufferedReader(new FileReader(source));
		writer=new BufferedWriter(new FileWriter(dest));
		String line=reader.readLine();
		int data;
		int count=0;
		while(line!=null)
		{    
			for(int i=0;i<line.length();i++)
			{
				data=(int)line.charAt(i)+shift;
				writer.write(data);
			}
			for(int i=0;i<line.length();i++)
			{	
				data=line.charAt(i);
				if(data=='a'||data=='e'||data=='i'||data=='o'||data=='u')
				{
					count++;
				}
				
			}
			
			writer.write((int)'\n');
			line=reader.readLine();
			
		}
		System.out.println("count:"+count);
		reader.close();
		writer.close();
	}
	catch(IOException e)
	{
		
	}
	
	
}
public void viewFileContent(String filename)
{
	BufferedReader reader;
	try {
		reader=new BufferedReader(new FileReader(filename));
		String line=reader.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line=reader.readLine();
			
		}
		reader.close();
	}
	catch(IOException e) {
		
	}
}
}
