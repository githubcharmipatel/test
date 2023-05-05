package testNG_charmi_assignment;

import org.testng.annotations.Test;

public class TestNG3 {
  @Test(groups = {"queen"})
  public void queen1 () {
	
		  System.out.println("I am in queen1");
	  }
      @Test(groups = {"queen"})
	  public void  queen2() {
		  System.out.println("I am in queen2");
	  }
	  @Test(groups = {"queen"})
	  public void queen3() {
		  System.out.println("I am in queen3");
	  }
	  @Test(groups = {"king"})
	  public void king1() {
		  System.out.println("I am in king1");
	  }
	  @Test(groups = {"king"})
	  public void king2() {
		  System.out.println("I am in king2");
	  }
	  @Test(groups = {"king"})
	  public void king3() {
		  System.out.println("I am in king3");
	  }
  }

