package innerclass;

public class modal {
int x=10;
modal(int x)
{
	this.x=x;
}
public modal() {
	
}

public void display()
{
	System.out.println(x);
}
	
	public class square{
		
		public void sq()
		{
			x=20;
			display();
		}
		
	}
}
