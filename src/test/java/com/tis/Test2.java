package com.tis;

import org.testng.annotations.Test;

public class Test2 {
	@Test(description="This is testcase1")  
	public void testcase1()  
	{  
	System.out.println("HR");  
	}  
	@Test(description="This is testcase2")  
	public void testcase2()  
	{  
	System.out.println("Software Developer");  
	}  
	@Test(description="This is testcase3")  
	public void testcase3()  
	{  
	System.out.println("QA Analyst");  
	}  

	@Test  
	public void WebStudentLogin()  
	{  
	System.out.println("Student login through web");  
	}  
	@Test  
	public void MobileStudentLogin()  
	{  
	System.out.println("Student login through mobile");  
	}  
	@Test(dependsOnMethods= {"WebStudentLogin"})  
	public void APIStudentLogin()  
	{  
	System.out.println("Student login through API");  
	}  
	
	@Test(dependsOnMethods= {"testc","testc1"})  
	 public void testcase6()  
	 {  
	     System.out.println("This is test case1");  
	 }  
	 @Test  
	 public void testc()  
	 {  
	     System.out.println("This is test case2");  
	 }  
	 @Test  
	 public void testc1()  
	 {  
	     System.out.println("This is test case3");  
	 } 
	 
	 
	 @Test 
	 public void mango()  
	 {  
	 System.out.println("I am Mango");  
	 }  
	 @Test(priority=2)  
	 public void apple()  
	 {  
	 System.out.println("I am Apple");  
	 }  
	 @Test(priority=1)  
	 public void watermelon()  
	 {  
	 System.out.println("I am Watermelon");  
	 }  
	 
	 
	 @Test  
	 public void c_language()  
	 {  
	 System.out.println("C language");  
	 }  
	 @Test(enabled=false)  
	 public void jira()  
	 {  
	 System.out.println("JIRA is a testing tool");  
	 }  
	 @Test  
	 public void java()  
	 {  
	 System.out.println("JAVA language");  
	 }  
	 
	 
	 @Test(groups= {"software company"})  
	 public void infosys()  
	 {  
	 System.out.println("Infosys");  
	 }  
	 @Test  
	 public void technip()  
	 {  
	 System.out.println("Technip India Ltd");  
	 }  
	 @Test(groups= {"software company"})  
	 public void wipro()  
	 {  
	 System.out.println("Wipro");  
	 }  
}
