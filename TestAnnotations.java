package testNG;

import org.testng.annotations.*;

public class TestAnnotations {
  @Test
  public void f1() {
	  System.out.println("Inside f1");	  
  }
  
  @Test
  public void f2() {
	  System.out.println("Inside f2");
  }
  
  @BeforeTest
  public void beforeAnyTest() {
	  System.out.println("Before any test case is run");
  }
  
  @AfterTest
  public void afterAllTheTests(){
	  System.out.println("After all tests");	  
  }
  
  @BeforeMethod
  public void beforeEveryMethod() {
	  System.out.println("Before every test method");
	  System.out.println("===========================");
  }
  
  @AfterMethod
  public void afterEveryMethod() {
	  System.out.println("===========================");
	  System.out.println("After every test method");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before class");
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("After class");
  }
}
