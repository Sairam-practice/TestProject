import java.util.Scanner;

public class Switchloop {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        String s = scan.next();
        Double d = scan.nextDouble();
    

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
	}
	
	
	
	
	

	
	/*private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        
		
		int at[] = {2, 4, 6};
		
		for(int i =0; i<at.length; i++) {
			
			System.out.println(at[i]);
		}

		 int N = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        if(!(N%2==0)){
		        System.out.println("Weird");
		    } else if(N>=2 && N<=5) {
		    	System.out.println("Not weird");
		    }else if(N>=6 && N<=20) {
		    	System.out.println("weird");	
		    }
		    else if((N%2==0) && N>20) {
		    	System.out.println("Not weird");
		    }
	        
	        scanner.close();
		
		
		int i = 2;
		
		switch(i)
		{
		case 1:
			System.out.println("case 1 is executed");
			
		case 2:
			System.out.println("case 2 is executed");
		default:
				
			System.out.println("default");
		}
		
	}

}*/
}