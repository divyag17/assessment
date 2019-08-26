package FileStream;
import java.io.*;
public class FileInputOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File inputfile=new File("input.txt");
		File outputfile=new File("outputfile.txt");
		
			FileInputStream in= new FileInputStream(inputfile);
			FileOutputStream OUT= new FileOutputStream(outputfile);
			int c;
			while((c=in.read())!=-1)
			{
				OUT.write(c);
			}
		in.close();
		OUT.close();
		
	}

}
