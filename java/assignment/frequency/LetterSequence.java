package frequency;

import java.util.Set;
import java.util.TreeMap;

public class LetterSequence {
private String sentence;

public LetterSequence(String sentence) {
	super();
	this.sentence = sentence;
}

public LetterSequence() {
	super();
}
public String getsentence()
{
	return this.sentence;
}
public void computeFrequency(String s)
{
	TreeMap<Character,Integer> c=new TreeMap<Character,Integer>();
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i) != ' ')
			c.put(s.charAt(i),0);
	}
	Set<Character> set = c.keySet();
	for(int i=0;i<s.length();i++) {
		for(Character chr:set)
		{
			if(s.charAt(i) == chr && s.charAt(i) != ' ') {
				int a=c.get(chr);
				c.put(chr,++a);
			}
				
		}
	}
	this.displayLetterFrequency(c);
	
}

public void displayLetterFrequency(TreeMap<Character,Integer> frequencyMap)
{
	Set<Character> set=frequencyMap.keySet();
    for(Character s:set) {
    	System.out.print(s+":");
    	for(int k=frequencyMap.get(s);k>0;k--) {
    		System.out.print("*");
    	}
    	System.out.println('\n');
    }
    }

}
