package exceptions;

public class testaccount {
public static void main(String arg[])
{
	
	try {
		account a1=new account();
		account a=new account("7857",967.97);
		
		a1.createaccount("7859",989.97);
		a.check(a1);
		
		
	}
	catch(AccountNotValiddException e)
	{
		System.err.println(e.getMessage());
	}
}
}
