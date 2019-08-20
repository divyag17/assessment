package staticmember;

public class tv extends electronics{
	private String name;
	public tv()
	{
		super();
	}
	@Override
	public String get() {
		return super.get()+" ,tv:"+name;
	}
	protected void set(String b) {
		super.set(2013);
		this.name=b;
		
	}
}
