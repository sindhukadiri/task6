package list;
import java.util.*;
public class methods {
	public static void main(String args[])
	{
		ArrayList<String>a=new ArrayList<String>();
		int i=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of list:");
		int n=s.nextInt();
		System.out.println("Enter elements");
		for(i=0;i<n;i++)
		{
			String c=s.next();
			a.add(c);
		}
		System.out.println("The initial list is:");
		System.out.println(a);
		System.out.println("Enter choice");
		System.out.println("1.Insert\t 2.Remove\t 3.Fetch\t 4.Exit\t");
		int b=s.nextInt();
		while(b!=5)
		{
		switch(b)
		{
		case 1:System.out.println("Enter element");
			   String e=s.next();
		       a.add(e);
		       break;
		case 2:System.out.println("Enter element");
			   e=s.next();
			   if(a.contains(e))
			   {
				   a.remove(e);
			   }
			   else
			   {
				   System.out.println(e+"is not present");
			   }
			   break;
		case 3:System.out.println("Fetching:");
			   for(String n1:a )
			   {
				   System.out.println(n1+' ');
			   }
			   break;
		case 4:System.out.println("You have exitted!");
			   break;
		}
		System.out.println("1.Insert\t 2.Remove\t 3.Fetch\t 4.Exit\t");
		b=s.nextInt();
		}
	}
}