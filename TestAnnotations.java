package testNG;

//import org.apache.log4j.xml.DOMConfigurator;
//import org.apache.log4j.Logger;
//import utility.Log;
//import org.testng.Reporter;
import org.testng.annotations.*;

public class TestAnnotations {
  @Test
  @Parameters({ "param1" })
  public void f1(String param1) {
//	  DOMConfigurator.configure("config/log4j.xml");
//	  Log.info("New driver instantiated");
	  System.out.println("Inside f1");
	  System.out.println("param1: " + param1);
  }
  
  @Test
  @Parameters({ "param2" })
  public void f2(String param2) {
	  System.out.println("Inside f2");
	  System.out.println("param2: " + param2);
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
