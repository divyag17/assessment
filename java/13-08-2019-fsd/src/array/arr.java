package array;

public class arr {
char[] arr=new char[27];
public void createarr(int l)
	{ for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)('a'+i);
		}
	}
public void getarr()
{
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(" "+arr[i]);
	}
}
public static void main(String arg[]) {
	arr a=new arr();
	a.createarr(27);
	a.getarr();
}
}

