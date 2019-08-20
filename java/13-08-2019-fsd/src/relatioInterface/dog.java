package relatioInterface;

public class dog implements livingthings{
	public String name;
	public String breed;
	dog(String name,String breed)
	{
		this.name=this.name;
		this.breed=breed;
	}
@Override 
public void walk()
{   
	System.out.println("dog walks");
	
}
public void details()
{
	new livingthings()
	{
		@Override
		public void walk()
		{ 
			System.out.println("dog "+name+"breed"+breed);
		}
	};
}
}
