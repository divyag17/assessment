package exceptions;
import java.io.Serializable;
public class person implements Serializable {
	/**
	 * 
	 */
	private String fname;
	private String lname;
	public person(String fname, String lname) {
		super();
		this.fname = fname;
		this.lname = lname;
	}
	
	
	public person() {
		super();
	}


	@Override
	public String toString() {
		return "person [fname=" + fname + ", lname=" + lname + "]";
	}


	public person check(String fname,String lname)throws NameNotValidException
	{	
		this.fname=fname;
		this.lname=lname;
		if(Character.isUpperCase(fname.charAt(0))==false && Character.isUpperCase(lname.charAt(0))==false)
		{
			throw new NameNotValidException("name is invalid");
		}
		else
		{
			System.out.println(this.toString());
		}
		return new person(fname,lname);
	}
}
