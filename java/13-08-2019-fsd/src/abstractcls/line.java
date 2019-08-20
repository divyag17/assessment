package abstractcls;

public class line extends model{
	private int start,end;

	public line(int start, int end) {
		
		this.start = start;
		this.end = end;
	}
	public int calculate()
	{
		return end-start;
	}
	@Override
	public boolean isGreater(Object o1,Object o2) {
		line l1=((line)o1);
		line l2=(line)o2;
		return l1.calculate()>l2.calculate();
	}
	@Override
	public boolean islesser(Object o1,Object o2) {
		line l1=(line)o1;
		line l2=(line)o2;
		return l1.calculate()<l2.calculate();
	}
	@Override
	public boolean isequal(Object o1) {
		 return isequal(o1);
	}
}
