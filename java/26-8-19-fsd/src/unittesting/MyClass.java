package unittesting;

import junit.framework.Test;
import junit.framework.TestResult;

public class MyClass implements Test {
	int add(int x,int y)
	{
		return x+y;
	}
	@Override
	public int countTestCases() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void run(TestResult arg0) {
		// TODO Auto-generated method stub

	}

}
