package TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Apputils.Apputils;

public class UserRegTest extends Apputils
{
    @Parameters({"firstname","lastname"})
	@Test
	public void CheckUserReg(String fname, String lname)
	{
		System.out.println("Enter as first Name:"+fname);
		System.out.println("Enter as last Name:"+lname);
	}
	
	
	
}
