package FileStream;

public class bufferedreader {
public static void main(String arg[])
{
	String a,a1,a2;
	if(arg.length !=3)
	{
		a="words.txt";
		a1="wordsout.txt";
		a2="1";
		
	}
	else
	{
		a=arg[0];
		a1=arg[1];
		a2=arg[2];
		
	}
	encryption e=new encryption();
	e.encrypt(a,a1, Integer.parseInt(a2));
	System.out.println("display..");
	e.viewFileContent(a1);
}
}
