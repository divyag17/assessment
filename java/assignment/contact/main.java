package contact;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count,in=1;
		String name,email,address;
		long mobile;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of inputs: \n");
		count = sc.nextInt();
		List<Contact> set=new ArrayList<Contact>();
		while(count>0)
		{
			System.out.println("Enter contact "+in+" detail");
			System.out.println("Name: ");
			name=sc.next();
			System.out.println("Email: ");
			email=sc.next();
			System.out.println("Mobile: ");
			mobile=sc.nextLong();
			System.out.println("Address: ");
			address=sc.next();
			set.add(new Contact(name,email,mobile,address));
			count--;
			in++;
		}
		sc.close();
		Collections.sort(set);
		System.out.println("Contact list after sort by mobile number in descending order\n");
		for(int i=0;i<set.size();i++)
		{
			System.out.println(set.get(i).getName()+"-"+set.get(i).getMobile());
		}
	}

}
