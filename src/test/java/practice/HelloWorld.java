package practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HelloWorld {

	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This is before method");
	}
	
	@Test
	public static void main() {
		System.out.println("This is test");

	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This is before method");
	}
	

}
