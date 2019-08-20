package array;

public class sorting {
	
	int arr[]={2,1,78,-20,45};
	int t;
	public void sort() {
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				t=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=t;
			}
		}
	}
	public void display()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
	}
	public void search(int k) {
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==k)
			{
				System.out.println("number found in index:"+i);
				
			}
			
		}
		
	}



public static void main(String arg[]) {
	sorting s=new sorting();
	s.sort();
	s.display();
	s.search(20);
	s.search(88);
	
	
	
	
	
}
}
