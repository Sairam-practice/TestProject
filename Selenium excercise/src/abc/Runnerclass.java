package abc;

import org.testng.TestNG;

public class Runnerclass {

	static TestNG testng;
	
	public static void main(String[] args) {
		
		testng = new TestNG();
		testng.setTestClasses(new Class[] {Exc.class});
		testng.run();  
		
	}

}
