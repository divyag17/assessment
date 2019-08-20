package array;
import java.util.*;
public class stack {
	
	
	static void showpush(Stack st, int a) {
	      st.push(a);
	     show(st);
	   }

	   static void showpop(Stack st) {
	      try {
	       st.pop();
	      show(st);
	      }
	      catch (EmptyStackException e) {
	          System.out.println("empty stack");
	       }
	   }
	   static void show(Stack st)
	   {
		   System.out.println("stack:"+st);
	   }
	   public static void main(String args[]) {
	      Stack st = new Stack();
	      showpush(st, 42);
	      showpush(st, 66);
	      showpush(st, 99); 
	      showpop(st);
	      showpop(st);showpop(st);showpop(st);
	      

	      
	   }
}
