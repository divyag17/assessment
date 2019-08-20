package array;
import java.util.Arrays;
public class MyArray {
private int arr[];
public void ascending(int arr[]) {
	Arrays.sort(arr);
	System.out.println("ascending:");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+",");
	}
}
public void descending(int arr[]) {
	Arrays.sort(arr);
	System.out.println("descending:");
	for(int i=arr.length-1;i>=0;i--)
	{
		System.out.print(arr[i]+",");
	}
}




public static void main(String arg[])
{
	int arr[]= {1,-29,89,56,12};
	new MyArray().ascending(arr);
	new MyArray().descending(arr);
}
}
