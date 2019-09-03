package emp;

public class Validate {
	String user;
	  String pass;
	public String getUser() {
		return user;
	}
	public Validate() {
		super();
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Validate(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}
	public String validate(String s1,String s2)
	  {
	    if(s1.equals(user) && s2.equals(pass))
	      return "VALID";
	    else
	     return "INVALID";
	   }
}
