package practice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.sql.DriverManager;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
  @Test(description="numerics")
  public void test() {
	  
	  System.out.println("1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("2");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("3");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("4");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("5");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("6");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("7");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("8");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("9");
  }
  
  
//  @Test(description="numerics")
//  public void test1() {
//	  
//	  System.out.println("33");
//  }
//  @Test(dependsOnMethods = {"test2","test3"})
//  public void depends() {
//	  
//	  System.out.println("Roll Numbers");
//	  
//  }
//  
//  @Test
//  public void test2() {
//	  
//	  System.out.println("63");
//  }
//  @Test
//  public void test3() {
//	  
//	  System.out.println("53");
//  }
//  @Test
  public void test4() {
	  
	  System.out.println("43");
  }

//  @Test(enabled=true)
//  
//  public void enable(){
//	  System.out.println("Switch Enabled");
//  }
//  @Test(groups= {"test3"})
//  public void group() {
//	  System.out.println("group done");
//  }
//  
  
 
  
  
  
  
  
  
  
  

}





















