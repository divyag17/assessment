package staticmember;

public class book extends product{
private int bookid;
private String author;
public book() {
	super();
	
}
@Override
public String get() {
	return super.get()+",bookid: "+bookid+",author "+author;
}
protected void set(int b,String a) {
	super.set(2000);
	this.bookid=b;
	this.author=a;
	
}
}
