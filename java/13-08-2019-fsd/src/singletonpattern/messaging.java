package singletonpattern;

public class messaging {
	private String msg;
	private static messaging messaging;
	messaging() {
		
	}
	private messaging(String msg)
	{
		
		this.msg=msg;
	}
	@Override
	public String toString() {
		return "messaging [msg=" + msg + "]";
	}
	public static messaging createobj()
	{
		if(messaging==null)
		{
			messaging m=new messaging();
		}
		return messaging ;
			
	}
	public static messaging createobj(String l)
	{
		if(messaging==null)
		{
			messaging =new messaging(l);
		}
		return messaging;
			
	}
	
}
