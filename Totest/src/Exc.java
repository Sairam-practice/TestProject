import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.Collections;

public class Exc {

	public static void main(String args[])
	{
		/*for (int i=0; i<=5; i++)
		{
			for(int k=5; k>=i; k--)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	*/
	ArrayList<String> tlist = new ArrayList<String>();
	tlist.add("dd");
	tlist.add(1,"rr");
	tlist.add(2, "Sai");
	tlist.add("fff");
	System.out.println(tlist);
	tlist.remove(2);
	System.out.println(tlist);
	
	ArrayList<String> alist = new ArrayList<String>();
	System.out.println("The default list size" +alist);
	alist.add("sai");
	alist.add("ram");
	alist.add("friend");
	for(String str:alist) {
		
		System.out.println(str);
	}
	
	Collections.sort(alist, Collections.reverseOrder());
	System.out.println(alist);
	  System.out.println(alist.get(2));
	  
	  
	  int num =7;
		if(num==10) {
			System.out.println("matched");
		}
		else {
				System.out.println("not matched");
			}
		
		
		int arr[] = {2, 4, 5, 6};
		for(int i=3; i>=0;i--) {
			
			System.out.println(arr[i]);
		}
		
		
		int numw = 10, count, total=0;
		for(count=1; count<=numw; count++) {
			total= total+count;
			
		}
		System.out.println("sum:"+total);
		
		
		}
	
	
	
	
	
	
}
