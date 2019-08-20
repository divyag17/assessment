package staticmember;

public class electronics extends product {
	private int year;
	
	public electronics() {
		super();
		
	}
	@Override
	public String get() {
		return super.get()+" , manufacture year:"+year;
	}
	protected void set(int b) {
		super.set(6700);
		this.year=b;
		
	}
}
