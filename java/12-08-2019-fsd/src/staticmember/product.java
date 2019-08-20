package staticmember;

public class product {
	private int current;
	private static int item=0;
	public product(){
		item++;
		System.out.println(item);
	}
	protected String get() {
		return " rate :"+current;
	}
	protected void set(int c) {
		this.current=c;
	}
	
	
	
}
