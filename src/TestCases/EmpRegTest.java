package TestCases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Apputils.Apputils;

public class EmpRegTest extends Apputils
{

	
	
	/*@Test
	public void CheckEmpReg()
	{
		System.out.println("this is new employe Registration Test");
	}*/
	
	
	@Parameters({"fname","lname"})
	@Test
	public void CheckEmpReg(String firstname, String lastname)
	{
		System.out.println("Enter First Name as "+firstname);
 		System.out.println("Enter Last Name as "+ lastname);
	
	}
	
	
	
	
	
}
