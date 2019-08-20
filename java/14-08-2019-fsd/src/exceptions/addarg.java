package exceptions;

public class addarg {
	public static void main(String arg[])
	{
		int sum=0;
		for(String a:arg) {
			try {
				System.out.println(arg[10]);
				sum+= Integer.parseInt(a);
				
			}
			catch(NumberFormatException e) {
				System.err.println("number format exceptions"+e.toString());
				System.err.println(e.getMessage());
				System.exit(0);
			}
			catch(ArrayIndexOutOfBoundsException E)
			{
				System.err.println(E.getMessage());
				System.exit(0);
			}
			//root exception catch block
			catch(Exception e)
			{
				System.err.println(e.getMessage());
			}
			finally {
				System.out.println("final block");
			}
		}
		System.out.println("sum: "+sum);
	}
	
}
