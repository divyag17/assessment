package exceptions;

public class NameNotValidException extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8548863389827276574L;
	private String msg;
	
	public NameNotValidException(String msg) {
		super();
		this.msg = msg;
	}
	
	public NameNotValidException() {
		super();
	}
	public String getMessage() {
		return msg;
	}

	public void setMessage(String msg) {
		this.msg=msg;
	}
}
