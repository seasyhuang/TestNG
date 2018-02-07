package testNG;

import org.testng.annotations.Test;

public class TestTestNGAttributes {
  @Test(priority=0)
  public void d() {
  }
  
  @Test(dependsOnMethods={"h"})
  public void e() {
  }
  
  @Test(priority=89)
  public void o() {
  }
  
  @Test(enabled=false)
  public void h() {
  }
  
  @Test(priority=34)
  public void f() {
  }
  
  @Test(priority=3)
  public void m() {
  }
  
}
