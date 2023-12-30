package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest 
{
	@Test
	void test1()
	{
		String expval,actual;
		expval ="Google";
		actual ="GooGle";
		Assert.assertEquals(actual.toLowerCase(), expval.toLowerCase());
	}
		
		
		
		@Test
		void test2()
		{
			String expval,actual;
			expval ="Google";
			actual ="Gmail";
			Assert.assertEquals(actual.toLowerCase(), expval.toLowerCase());
				
		
		
		
		/*if(expval.equalsIgnoreCase(actual))
		{
			System.out.println("both are same");
		}else
		{
			System.out.println("both are not same");
		}*/
	}
	

}
