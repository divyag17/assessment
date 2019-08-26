package serialization;

import java.io.File;

public class fileinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file="employee.out";
		File fn=new File(file);
		try {
			fn.createNewFile();
		}
		catch(Exception e)
		{
			
		}
	}

}
