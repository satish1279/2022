package testpkg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PracTest {

	@Test()

	public void method1Name() {

		System.out.println("this is 1st method");
		Assert.assertEquals("satish", "satish");


	}


	@Test

	public void method2Name() {

		System.out.println("this is 2nd method");
		Assert.assertEquals("satish", "kumar");


	}



}
