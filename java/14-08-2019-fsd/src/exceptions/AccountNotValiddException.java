package exceptions;

public class AccountNotValiddException extends Throwable {
/**
	 * 
 */
	private static final long serialVersionUID = -4579660256017079400L;
	private String msg;
	
	public AccountNotValiddException(String msg) {
		super();
		this.msg = msg;
	}
	
	public AccountNotValiddException() {
		super();
	}
	public String getMessage() {
		return msg;
	}

	public void setMessage(String msg) {
		this.msg=msg;
	}
}
