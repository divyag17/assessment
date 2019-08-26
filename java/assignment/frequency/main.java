package frequency;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetterSequence l=new LetterSequence();
		Scanner scanner=new Scanner(System.in);
		String n=scanner.next();
		l.computeFrequency(n);
		
	}

}
