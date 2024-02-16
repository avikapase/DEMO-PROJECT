package practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class HelloWorld {

	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("This is before method");
	}
	
	@Parameters("DynanicNameFromJenkinsJob")
	@Test(enabled=false)
	public static void main(String value) {
		System.out.println("This is test with parameterized from maven" + value);

	}
	
	@Test
	public static void main() {
		System.out.println("This is test from jenkinsfile");

	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("This is before method");
	}
	

}
