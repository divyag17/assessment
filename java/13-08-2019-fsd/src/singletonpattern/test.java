package singletonpattern;

public class test {
public static void main(String arg[])
{
	messaging m1=new messaging();
	System.out.println(m1.createobj());
	messaging m3=new messaging();
	System.out.println(m3.createobj("hello"));
}
}
