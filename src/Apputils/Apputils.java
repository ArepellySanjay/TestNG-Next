package Apputils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Apputils 
{

	@BeforeSuite
	public void LanchApp()
	{
		System.out.println("Lanch orangehrm App");
	}
	
	
	@AfterSuite
	public void closeApp()
	{
		System.out.println("close orangehrm App");
	}
	
	
	@BeforeTest
	public void adminLogin()
	{
		System.out.println("Login as admin");
	}
	
	
	
	@AfterTest
	public void adminlogout()
	{
		System.out.println("Logout from admin module");
	}
	
	
	
	
	
	
	
}
