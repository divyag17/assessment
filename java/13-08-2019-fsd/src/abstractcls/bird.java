package abstractcls;

public class bird extends flyer{
	@Override
	public void fly()
	{
		System.out.println("bird flies");
	}
	@Override
	public  void takeoff() {
		System.out.println("takeoff");
	}
}
